package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.apache.xerces.util.XMLCatalogResolver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSInput;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class XbrlValidationWithXsdUsesXercesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(XbrlValidationWithXsdUsesXercesApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        // Compute path to the XBRL payload to be validated.
        final Path xbrlPath = Path.of("src/main/resources/xbrl/xbrl_001_APRA-valid.xml");
        final Source xmlStreamSource = new StreamSource(xbrlPath.toFile());

        // Create objects to do the validation.
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        final Path xsdPath = Path.of(
                "src/main/resources/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.conttrans.request.02.02.report.xsd");
        final Schema schema = schemaFactory.newSchema(xsdPath.toFile());

        // Create the validator.
        javax.xml.validation.Validator validator = schema.newValidator();

        // Set up a catalog so that use the local XSD files and not look them up from the internet.
        // Set up a CatalogResolver so that use the local XSD files and not look them up from the internet.
        final String[] catalogs = {"xsd/catalog.xml"};
        final XMLCatalogResolver resolver = new XMLCatalogResolver(catalogs) {
            @Override
            public LSInput resolveResource(
                    final String type,
                    final String namespaceURI,
                    final String publicId,
                    final String systemId,
                    final String baseURI
            ) {
                final LSInput lsInput = super.resolveResource(type, namespaceURI, publicId, systemId, baseURI);
                final String resolvedSystemId = (lsInput != null) ? lsInput.getSystemId() : "null";
                System.out.println("Attempted to resolve '" + systemId + "', resolved to: " + resolvedSystemId);
                return lsInput;
            }
        };
        schemaFactory.setResourceResolver(resolver);

        // Capture the XSD errors so that we can report them back.
        final XsdErrorHandler errorHandler = new XsdErrorHandler(xbrlPath);
        validator.setErrorHandler(errorHandler);

        // Validate and extract errors.
        validator.validate(xmlStreamSource);
        if (errorHandler.getErrors().isEmpty()) {
            System.out.println("'" + xbrlPath
                    + "' is valid against '" + xsdPath
                    + "'.");
        }
        for (SAXParseException error : errorHandler.getErrors()) {
            System.err.println("Error: " + error.toString());
        }
    }

    public static final class XsdErrorHandler implements ErrorHandler {

        /**
         * List of errors from parsing an XML file.
         */
        private final List<SAXParseException> errors = new ArrayList<>();

        /**
         * The XSD file being validated.
         */
        private final Path xmlFile;

        /**
         * Instantiates a new XSD error handler.
         *
         * @param xmlFile the XML file being validated.
         */
        public XsdErrorHandler(final Path xmlFile) {
            this.xmlFile = xmlFile;
        }

        /**
         * Gets errors.
         *
         * @return the errors
         */
        public List<SAXParseException> getErrors() {
            return errors;
        }

        @Override
        public void warning(final SAXParseException exception) {
            System.err.println("Warning occurred during validation of XML file '" + xmlFile.getFileName() + "': '"
                    + exception.getMessage() + "'.");
            errors.add(exception);
        }

        @Override
        public void error(final SAXParseException exception) {
            System.err.println("Error occurred during validation of XML file '" + xmlFile.getFileName() + "': '"
                    + exception.getMessage() + "'.");
            errors.add(exception);
        }

        @Override
        public void fatalError(final SAXParseException exception) {
            System.err.println("Fatal error occurred during validation of XML file '" + xmlFile.getFileName() + "': '"
                    + exception.getMessage() + "'.");
            errors.add(exception);
        }
    }
}
