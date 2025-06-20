package FactoryTest;

import ConcreteDocument.Document;
import FactoryMethod.DocumentFactory;
import FactoryMethod.ExcelDocumentFactory;
import FactoryMethod.PdfDocumentFactory;
import FactoryMethod.WordDocumentFactory;

public class FactoryMethodTest {
    public static void main(String args[]) {
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();
    }
}
