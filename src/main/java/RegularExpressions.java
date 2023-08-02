import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {

        String mensajeConfirmacion= "El suplemento 900902789/1 ha sido dado de alta correctamente\n" +
                "*** Se han anulado los siguiente recibos\n" +
                "El recibo 2023/610341401 se ha anulado correctamente\n" +
                "*** Se han emitido los siguiente recibos\n" +
                "El recibo 2023/612631501 12/08/2023 12/02/2024 289,51 se ha generado correctamente\n" +
                "El recibo 2023/612631502 12/02/2024 12/08/2024 287,61 se ha generado correctamente";

        buscarExpresionesRegulares("[0-9]{4}/[0-9]{9}",mensajeConfirmacion);

    }


    public static void buscarExpresionRegular(String expresionRegular, String cadena) {

        String cadenaEncontrada = null;
        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(cadena);
        if (matcher.find()) {
            int posicionInicio = matcher.start();
            int posicionFinal = matcher.end();
            cadenaEncontrada = cadena.substring(posicionInicio, posicionFinal);
            System.out.println("Se ha encontrado el patrón buscado. Se ha extraído la cadena:" + cadenaEncontrada + ".");
        } else
            System.out.println("No se ha encontrado el patrón buscado.");

    }

    public static void buscarExpresionesRegulares(String expresionRegular, String cadena){

        ArrayList<String> allMatches = new ArrayList<String>();
        Matcher m = Pattern.compile(expresionRegular)
                .matcher(cadena);
        while (m.find()) {
            allMatches.add(m.group());
        }

        if (allMatches.size() == 0)
            System.out.println("No se ha encontrado ninguna expresión regular coincidente.");
        else {
            System.out.println("Patrones encontrados: ");
            for (String match : allMatches) {
                System.out.println(match);
            }
        }

    }

    /*
    URL

    Buscar expresión regular: https://www.freeformatter.com/java-regex-tester.html
    Blog explicaciónes: https://www.gonduana.com/expresiones-regulares-en-los-filtros-de-studio/
    Representacion visual expresión regular: https://regexper.com/#PRECIOFINAL%5B%5Cs%5Cn%5D*%5B0-9%5D%2B%2C%5B%5Cs%5Cn%5D*%5B0-9%5D%7B2%7D%5B%5Cs%5Cn%5D*al%7C%26nbsp%3Ba%C3%B1o%5B%5Cs%5Cn%5D*%E2%82%AC


    - Números y letras
    - Rangos y cantidad de veces que aparecen
    - Caracteres especiales
    - Buscar al comienzo y al final de una linea

    Ejemplo: Se ha generado con número de referencia MDP/510/000000/VRD/2023/01132 la demanda de comprobación del riesgo del proyecto 1856207, necesaria para la contratación de la póliza solicitada. En breve recibirá el resultado de dicha comprobación con la contratación de la póliza o con las modificaciones sugeridas por el perito. Se ha guardado una copia del proyecto que se podrá consultar en la pestaña 'Documentos' de la consulta del proyecto documento (1856207_20230725-ANTESDEVERIFICACION.PDF).


    Ejemplo:
      String mensajeConfirmacion= "El suplemento 900902789/1 ha sido dado de alta correctamente\n" +
                "*** Se han anulado los siguiente recibos\n" +
                "El recibo 2023/610341401 se ha anulado correctamente\n" +
                "*** Se han emitido los siguiente recibos\n" +
                "El recibo 2023/612631501 12/08/2023 12/02/2024 289,51 se ha generado correctamente\n" +
                "El recibo 2023/612631502 12/02/2024 12/08/2024 287,61 se ha generado correctamente";

Ejemplo mutua: limpiarFicheroDescargadoParaComprobaciones()
         */



}


