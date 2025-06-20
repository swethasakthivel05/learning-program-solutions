package ConcreteDocument;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a excel document.");
    }
}
