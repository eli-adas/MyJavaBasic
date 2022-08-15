import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public void main(String[] args) {

        buscarExpresionRegular("","");

    }


    public String buscarExpresionRegular(String expresionRegular, String cadena) {

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


        return cadenaEncontrada;
    }

}


