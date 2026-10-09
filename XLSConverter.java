public class XLSConverter extends Converter {

    // Constructor
    public XLSConverter(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Línea con XLS");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con XLS");
    }

    public void makeTable() {
        System.out.println("Tabla con XLS");
    }

}
