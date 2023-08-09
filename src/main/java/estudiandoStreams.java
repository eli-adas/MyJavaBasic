import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class estudiandoStreams {

    public static void main(String[] args) {

   

    }

    public static void dia1() {

        //https://dev.to/educative/java-8-tutorial-master-stream-api-and-beyond-2734


        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(20);
        lista.add(19);
        lista.add(100);
        lista.add(2);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) > 10) {
                System.out.println(lista.get(i));
            }
        }

        lista.stream()
                .filter(cadaElemento -> cadaElemento > 10)
                .forEach(System.out::println);


        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("eli");
        nombres.add("mayuri");
        nombres.add("antoniya");
        nombres.add("andrea");
        nombres.add("jessi");

        System.out.println("--->bucle for");
        for (String nombre : nombres) {
            System.out.println(nombre.toUpperCase(Locale.ROOT));
        }

        System.out.println("--->stream");
        nombres.stream()
                .map(nombre -> nombre.toUpperCase(Locale.ROOT))
                .filter(nombre -> nombre.contains("Y"))
                .forEach(System.out::println);

        System.out.println("---> solo for each");

        nombres.stream().forEach(System.out::println);

        for (int i = 0; i < nombres.size(); i++) {
            String nombreMay = nombres.get(i).toUpperCase(Locale.ROOT);
            nombreMay = nombreMay + "/";
            nombreMay = nombreMay.replaceAll("A", "E");
            System.out.println("Nombre tras modificaciones" + nombreMay);
        }

        nombres.stream().forEach(nombre -> {
            String nombreMay = nombre.toUpperCase(Locale.ROOT);
            nombreMay = nombreMay + "/";
            nombreMay = nombreMay.replaceAll("A", "E");
            System.out.println("Nombre tras modificaciones" + nombreMay);

        });

        String[] a = {"a", "b"};
        Arrays.stream(a);


        List<Integer> c = new ArrayList<>();
        c.stream();
    }

    public static void dia2() {



     //   1 Hacer un array de matriculas y filtramos por elementos que no comiencen por A, organizar los números de mayor a menor.


            String[] arrayMatriculas = {"A1234ABC", "4345BCD", "3456CDE"};

            Arrays.stream(arrayMatriculas).filter(matricula -> !matricula.startsWith("A")).sorted((a,b) -> b.compareTo(a)).forEach(System.out::println);

      //  2. Hacer un arrayList de subgarantias, comprobar que hay una concreta y renombrar () -> otra

      //  3. Hacer un List de nombres de perros y gatos,   modificar los nombres que tengan mas de 3 letras y añadir un número.*/
            ArrayList<String> garantias = new ArrayList<>(Arrays.asList("Incendio", "Fenomenos atmosfericos", "Aguas", "Responsabilidad civil"));

            AtomicInteger control = new AtomicInteger(0);
            garantias.stream().forEach(palabra -> {
                if(palabra.contains("Aguas")){
                    garantias.set(control.get(), "Inundaciones");
                }
                control.getAndIncrement();
            });
            System.out.println(garantias);

            for(int i=0; i<garantias.size(); i++){
                if(garantias.get(i).contains("Aguas")){
                    garantias.set(i,"Incendio");
                }
            }
            System.out.println(garantias);



    }

    public static void ejerciciolistasDia3() {
        /*
        Ejercicio para hacer juntos. Hacer dos listas, y ver si una tiene diferencias con respecto a otra.
        https://www.baeldung.com/java-lists-difference
         */

        ArrayList<String> lista1 = new ArrayList<String>(List.of("blanco", "azul", "gris"));

        ArrayList<String> lista2 = new ArrayList<String>(List.of("blanco", "azul", "amarillo"));


    }
}


