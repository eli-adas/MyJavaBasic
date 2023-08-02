import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class PdfBox {

    public static void main(String[] args) {

       extraerFicheroDescargado("LOCAL.202307251147.1.CARTACSI_ROSA QUIROGA HERNANDEZ.pdf");
    }

    public static String extraerFicheroDescargado(String nombreFicheroPDF) {

        String path = String.format(System.getProperty("user.home") + File.separator + "Downloads/%s", nombreFicheroPDF);
        System.out.println("Path donde se busca el fichero:" + path);
        File fichero = new File(path);
        String contenidoPdf = null;

        if (fichero.exists()) {
            contenidoPdf = pdfAString(path).replaceAll("[\\.)(\\s]", "").toUpperCase(Locale.ROOT);;
            System.out.println(contenidoPdf);
        } else
            org.testng.Assert.fail("El fichero " + nombreFicheroPDF + " no se ha encontrado en la carpeta descargas.");


        return contenidoPdf;
    }

    public static String pdfAString(String path) {

        File file = new File(path);
        PDDocument document = null;
        try {
            document = PDDocument.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PDFTextStripper pdfStripper = null;
        try {
            pdfStripper = new PDFTextStripper();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = null;
        try {
            text = pdfStripper.getText(document);
        } catch (IOException e) {
            e.printStackTrace();
        }
        text.replaceAll("\n", " ");
        try {
            document.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;

    }

}
