package ex6;

public class DocumentPrintApp {
    public static void main(String[] args) {
        Document pdf = new PdfDocument();
        pdf.print();

        Document html = new HtmlDocument();
        html.print();

        Document xml = new XmlDocument();
        xml.print();
    }
}
