public class EjecutarBuilder {
    public static void main(String[] args) {
        
        Converter objC1 = new ASCIIConverter("Tesis");
        Converter objC2 = new PostScriptConverter("Tesis");
        Converter objC3 = new PDFConverter("Tesis");
        Converter objC4 = new XLSConverter("Tesis");

        Reader objR1 = new Reader("LINE", objC1);
        Reader objR2 = new Reader("PARAGRAPH", objC2);
        Reader objR3 = new Reader("TABLE", objC3);
        Reader objR4 = new Reader("TABLE", objC4);

        objR1.parseInput(); //Línea con ASCII
        objR2.parseInput(); //Paragraph con PostScript
        objR3.parseInput(); //Tabla con PDF
        objR4.parseInput(); //Tabla con XLS

    }
}
