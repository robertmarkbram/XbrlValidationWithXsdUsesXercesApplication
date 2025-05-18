package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.apache.xerces.util.XMLCatalogResolver;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.w3c.dom.ls.LSInput;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.IOException;
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
        validateFile(Path.of("src/main/resources/xbrl/xbrl_001_APRA-valid.xml"));
        //        validateFile(Path.of("src/main/resources/xbrl/xbrl_003_APRA-has-errors.xml"));
    }

    private static void validateFile(final Path xbrlPath) throws SAXException, IOException {
        System.out.println("\n\n========== " + xbrlPath + " ==========");

        final Source xmlStreamSource = new StreamSource(xbrlPath.toFile());

        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        final String base = "src/main/resources/xsd/www.xbrl.org/2003/";
        final String entryPointXsd = "src/main/resources/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.conttrans.request.02.02.report.xsd";
        StreamSource[] xsdSources = new StreamSource[]{
                new StreamSource(entryPointXsd),
                new StreamSource(base + "xbrl-linkbase-2003-12-31.xsd"),
                new StreamSource(base + "xl-2003-12-31.xsd"),
                new StreamSource(base + "xlink-2003-12-31.xsd"),
                new StreamSource(base + "xbrl-instance-2003-12-31.xsd")
        };
        for (StreamSource s : xsdSources) {
            s.setSystemId(Path.of(s.getSystemId()).toUri().toString());
        }

        final String[] catalogs = {"src/main/resources/xsd/catalog.xml"};
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

        final Schema schema = schemaFactory.newSchema(xsdSources);

        javax.xml.validation.Validator validator = schema.newValidator();

        final XsdErrorHandler errorHandler = new XsdErrorHandler(xbrlPath);
        validator.setErrorHandler(errorHandler);

        validator.validate(xmlStreamSource);
        if (errorHandler.getErrors().isEmpty()) {
            System.out.println("'" + xbrlPath
                    + "' is valid against '" + entryPointXsd
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
