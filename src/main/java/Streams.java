

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {

        intStream(0,4);
        forEachArrayList();
        operadorTernario(true,"B");
        //Eli coment

    }

    //Bucle for desde begin hasta end-1, Ej de (0,4) pasa por 0,1,2 y 3
    public static void intStream(int begin, int end){

        IntStream.range(begin, end).forEach(j -> {
            System.out.println(" contador "+ j);

        });
    }

    public static void forEachArrayList(){

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("30.000,87€");
        arrayList1.add("45,66€");
        arrayList1.add("679,89€");
        arrayList1.add("23.450,27€");
        System.out.println(arrayList1);
        final int[] i = {0};
        arrayList1.stream().forEach(element -> {
            arrayList1.set(i[0],element.replace("€", "$").split(",")[0]);
            i[0]++;
        });
        System.out.println(arrayList1);
    }

    public static void operadorTernario(boolean control, String letter){

        int j;
        j = (control ? 3 : 5);
        System.out.println(j);

        //Es igual a:
        if(control)
            j =3;
        else
            j= 5;


        double a = ( letter.equals("MED001")? 17.23 : (letter.equals("MED002") ? 38.90 : 70.30));
        System.out.println(a);

        //Es lo mismo que:
        if(letter.equals("MED001"))
            a= 17.23;
        else if(letter.equals("MED002"))
            a = 38.90;
        else
            a= 70.30;
    }

    public static void romperBucleConStream(Map<Integer, String> mp){

        AtomicBoolean control = new AtomicBoolean(true);
        mp.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getKey))
                .takeWhile(entry -> control.get())
                .forEach((entry) ->{
                    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                    // frameHelper.clickInFrame(By.cssSelector(String.format(accionesBtn, entry.getKey() )), cuerpoFrame);
                    //debugInfo("Revisando fila: " + (entry.getKey()-1) );
                    //if(frameHelper.isPresentInFrame(suplementoMedioPagoBtn, cuerpoFrame)){
                    //  frameHelper.clickInFrame(suplementoMedioPagoBtn, cuerpoFrame);
                    // debugInfo("Se ha clicado en póliza: " + entry.getValue() );
                    //setTestVar(NUM_POLIZA, entry.getValue() );
                    control.set(false);
                    // }
                });

    }

    public static void streamsListWebElements(){

        AtomicInteger counter = new AtomicInteger(2);
        webDriver.getElements(productoList).stream().forEach(element -> {
            mp.put(counter.intValue(),element.getText().trim());
            counter.getAndIncrement();
        });

    }

    public static void streamJoinString(){

        @Test
        public void whenCollectByJoining_thenGetJoinedString() {
            String empNames = empList.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(","))
                    .toString();

            assertEquals(empNames, "Jeff Bezos,Bill Gates,Mark Zuckerberg");
        }
    }

    public static void streamsGroupedInMapsBy(){
        @Test
        public void whenStreamGroupingBy_thenGetMap() {
            Map<Character, List<Employee>> groupByAlphabet = empList.stream().collect(
                    Collectors.groupingBy(e -> new Character(e.getName().charAt(0))));

            assertEquals(groupByAlphabet.get('B').get(0).getName(), "Bill Gates");
            assertEquals(groupByAlphabet.get('J').get(0).getName(), "Jeff Bezos");
            assertEquals(groupByAlphabet.get('M').get(0).getName(), "Mark Zuckerberg");
        }
    }

    public static void streamNotNullList(){
        Stream<Integer> result = number != null
                ? Stream.of(number)
                : Stream.empty();
    }

    public createStringfromArray(){
        Stream.of(data)
                .collect(Collectors.joining(";"));
    }

    public createStringFromArrayList(){
        String joined = attachmentNames.stream().map(Object::toString).collect(Collectors.joining(";"));
    }
}
