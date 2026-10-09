public class Converter {

    // Atributos
    private String document;

    // Constructor de la clase
    public Converter(String document) {
        this.document = document;
    }

    // Métodos
    public String getDocument() {
        return document;
    }

    public void makeLine(){}
    public void makeParagraph(){}
    public void makeTable(){}
}
