public class ASCIIConverter extends Converter {

    // Constructor
    public ASCIIConverter(String document) {
        super(document);
    }

    public void makeLine() {
        System.out.println("Línea con ASCII");
    }

    public void makeParagraph() {
        System.out.println("Párrafo con ASCII");
    }

    public void makeTable() {
        System.out.println("Tabla con ASCII");
    }
}
