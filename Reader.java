public class Reader {
    //Atributos
    private String element;
    private Converter converter;

    //Constructor de la clase
    public Reader(String element, Converter converter){
        this.element = element;
        this.converter = converter;
    }

    //Métodos de la clase
    public void parseInput(){
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;
            case "PARAGRAPH":
                converter.makeParagraph();
                break;
            case "TABLE":
                converter.makeTable();
                break;
            default:
                System.out.println("Informacón no suminstrada");
                break;
        }
    }
}
