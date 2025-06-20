package FactoryMethod;

import ConcreteDocument.Document;
import ConcreteDocument.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
