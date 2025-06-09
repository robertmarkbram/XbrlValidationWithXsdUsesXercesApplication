package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.apache.xerces.util.XMLCatalogResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class XbrlValidationWithXsdUsesXercesApplication implements CommandLineRunner {

    private static Logger log = LoggerFactory.getLogger(XbrlValidationWithXsdUsesXercesApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(XbrlValidationWithXsdUsesXercesApplication.class, args);
    }

    @Override
    public void run(final String... args) throws Exception {
        // Compute path to the XBRL payload to be validated.
        validateFile(Path.of("src/main/resources/xbrl/xbrl_001_valid.xml"));
        validateFile(Path.of("src/main/resources/xbrl/xbrl_002_invalid-against-Schematron.xml"));
        validateFile(Path.of("src/main/resources/xbrl/xbrl_003_invalid-against-XSD.xml"));
    }

    private static void validateFile(final Path xbrlPath) throws SAXException, IOException {
        log.info("========== {} ==========", xbrlPath);

        // Create the schema factory.
        final SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

        // Tell the schema factory to use a catalog and resource resolver to use local XSD files.
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
                log.debug("Attempted to resolve '{}' to '{}'.", systemId, resolvedSystemId);
                return lsInput;
            }
        };
        schemaFactory.setResourceResolver(resolver);

        // Create the validator using the XSD.
        final String entryPointXsd = "src/main/resources/xsd/sbr.gov.au/taxonomy/sbr_au_reports/sprstrm/sprcnt/sprcnt_0001/sprcnt.0001.conttrans.request.02.02.report.xsd";
        final Schema schema = schemaFactory.newSchema(new File(entryPointXsd));
        javax.xml.validation.Validator validator = schema.newValidator();

        // Add an error handler.
        final XsdErrorHandler errorHandler = new XsdErrorHandler(xbrlPath);
        validator.setErrorHandler(errorHandler);

        // Validate and output errors.
        final Source xmlStreamSource = new StreamSource(xbrlPath.toFile());
        validator.validate(xmlStreamSource);
        if (errorHandler.getErrors().isEmpty()) {
            log.info("'{}' is valid against '{}'.", xbrlPath, entryPointXsd);
        }
        for (SAXParseException error : errorHandler.getErrors()) {
            log.error("Error: {}", error.toString());
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
            log.debug("Warning occurred during validation of XML file '{}': '{}'.", xmlFile.getFileName(),
                exception.getMessage());
            errors.add(exception);
        }

        @Override
        public void error(final SAXParseException exception) {
            log.debug("Error occurred during validation of XML file '{}': '{}'.", xmlFile.getFileName(),
                exception.getMessage());
            errors.add(exception);
        }

        @Override
        public void fatalError(final SAXParseException exception) {
            log.debug("Fatal error occurred during validation of XML file '{}': '{}'.", xmlFile.getFileName(),
                exception.getMessage());
            errors.add(exception);
        }
    }
}
