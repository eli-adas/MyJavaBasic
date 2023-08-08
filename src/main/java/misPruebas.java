import org.testng.Assert;

public class misPruebas {

    public static void main(String[] args) {

        String asistencia = "TRUE";
        boolean asist2 = false;


        if (asistencia.equals("TRUE")) {
            if (asist2) {
                System.out.println("Habia asistencia y se ha comprobado el documento");
            } else {
              //  Assert.fail("Se generó una asistencia, pero no se detecto que el documento fuera generado. ¿Cómo buscar este documento? El nombre son 13 o más números" +
                //        " y en su interior la referencia externa es esta: ");
                System.out.println("JI");
            }


        }


        if(asistencia.equals("TRUE") && !asist2){
            System.out.println("KO");
        }else{
        //    Assert.fail();
        }
    }
}
