package com.example.XBRL_validation_with_xsd_uses_xerces;

import org.w3c.dom.ls.LSInput;
import org.w3c.dom.ls.LSResourceResolver;

import java.io.InputStream;

public class ClasspathResourceResolver implements LSResourceResolver {

    @Override
    public LSInput resolveResource(
        String type,
        String namespaceURI,
        String publicId,
        String systemId,
        String baseURI) {
        try {
            // Try to load from classpath
            InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream(systemId);
            if (resourceAsStream != null) {
                return new LSInputImpl(publicId, systemId, resourceAsStream);
            }
        } catch (Exception e) {
            // Ignore and return null
        }
        return null;
    }
}