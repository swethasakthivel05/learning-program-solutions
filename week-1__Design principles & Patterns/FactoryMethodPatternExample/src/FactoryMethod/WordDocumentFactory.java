package FactoryMethod;

import ConcreteDocument.Document;
import ConcreteDocument.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
