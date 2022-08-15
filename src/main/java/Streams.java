

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

       // intStream(0,4);
        forEachArrayList();

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
}
