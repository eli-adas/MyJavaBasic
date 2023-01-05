import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class Colecciones {

    public static void main(String[] args) {

        comprueboSiUnArrayContieneElementosDeOtroArrayList();
        retainALL();
    }

    public static void comprueboSiUnArrayContieneElementosDeOtroArrayList() {

        System.out.println("------------ CONTAINS ALL -----------------");

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("esta es esta con esta y con la otra");
        arrayList1.add("es");
        arrayList1.add("una");
        arrayList1.add("comprobación");
        System.out.println("Arraylist1 " + arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("esta");
        arrayList2.add("no");
        arrayList2.add("es");
        arrayList2.add("una");
        arrayList2.add("comprobación");
        System.out.println("Arraylist2 " + arrayList2);

        /*
        arraylist.containsAll(Collection c);
        Here, arraylist is an object of the ArrayList class.
        collection - checks if all elements of collection are present in the arraylist.

        returns true if the arraylist contains all elements of collection
        throws ClassCastException if the class of elements present in arraylist is incompatible with the class of elements in the specified collection
        throws NullPointerException if collection contains null elements and the arraylist does not allow null values

         */
        //¿Todos los elementos del arraylist1 estan contenidos en el 2?
        System.out.println("---> arrayList2.contains(arrayList1)");
        System.out.println("¿Todos los elementos del arraylist1 estan contenidos en el 2?");
        if (arrayList2.containsAll(arrayList1))//sale true porque todos los elementos del arraylist1 estan en el dos
            System.out.println("True: Arraylist1 contiene todos los elementos del 2");
        else
            System.out.println("False: Arraylist1 no contiene todos los eleementos del 2");

        //¿Todos los eleementos del arraylist 2 estan contenidos en el uno?
        System.out.println("---> arrayList1.contains(arrayList2)");
        System.out.println("//¿Todos los eleementos del arraylist 2 estan contenidos en el uno?");
        if (arrayList1.containsAll(arrayList2)) //sale true
            System.out.println("True: Arraylist 2 contiene todos los elementos de arrayList1");
        else//sale false -->> Cuidado! el arrayList2 tiene un elemento mas que el 1.
            System.out.println("False:El arraylist2 no contiene todos los elementos del arrayList1");


        //Con ARRAY:
        if (arrayList1.containsAll(Arrays.asList(new String[]{"esto", "es", "una", "comprobación"})))
            System.out.println("True:Arraylist 1 contiene todos los elementos de un array identico.");
    }

    //Conservar en un array solo los elementos presentes en otro
    public static void retainALL() {

        /*
        The syntax of the retainAll() method is:

        arraylist.retainAll(Collection c);
        collection -only those elements present in collection are retained in the arraylist.
        retainAll() Return Value
            returns true if elements are removed from the arraylist
            throws ClassCastException if the class of elements present in arraylist is incompatible with the class of elements in the specified collection
            throws NullPointerException if the arraylist contains null element and the specified collection does not allow null elements
         */

        System.out.println("------------RETAIN ALL -----------------");

        // create an ArrayList
        ArrayList<String> languages1 = new ArrayList<>();

        // insert element to the ArrayList
        languages1.add("JavaScript");
        languages1.add("Python");
        languages1.add("Java");
        System.out.println("ArrayList 1:1º parametro " + languages1);

        // create another ArrayList
        ArrayList<String> languages2 = new ArrayList<>();

        // add elements to ArrayList
        languages2.add("English");
        languages2.add("Java");
        languages2.add("Python");
        System.out.println("ArrayList 2: (colección) 2º parametro " + languages2);

        // retain the common element
        languages1.retainAll(languages2);
        System.out.println("Los elementos natalicios en la colección son los que se conservan en el array:");
        System.out.println("Common Elements: " + languages1);
    }

}
