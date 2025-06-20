package FactoryMethod;

import ConcreteDocument.Document;
import ConcreteDocument.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
