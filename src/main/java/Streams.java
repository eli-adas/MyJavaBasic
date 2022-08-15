

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Streams {

    public static void main(String[] args) {

       // intStream(0,4);
       // forEachArrayList();
        operadorTernario(true,"B");

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
}
