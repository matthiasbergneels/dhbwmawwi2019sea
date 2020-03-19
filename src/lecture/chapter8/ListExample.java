package lecture.chapter8;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List listOfNames = new ArrayList();


        listOfNames.add("Klaus");
        listOfNames.add("Gabi");
        listOfNames.add("Michael");
        listOfNames.add("Hans");
        listOfNames.add("Klaus");
        listOfNames.add("Fritz");
        listOfNames.add(1,"Heinz");

        System.out.println("Anzahl Namen: " + listOfNames.size());

        System.out.println("Klaus gelöscht: " + listOfNames.remove("Klaus"));

        System.out.println("Klaus gefunden: " + listOfNames.contains("Klaus"));

        System.out.println("Klaus gelöscht: " + listOfNames.remove("Klaus"));

        System.out.println("Klaus gelöscht: " + listOfNames.remove("Klaus"));

        System.out.println("Klaus gefunden: " + listOfNames.contains("Klaus"));

        System.out.println("Anzahl Namen: " + listOfNames.size());

        System.out.println("Index 0 gelöscht: " + listOfNames.remove(0));

        System.out.println("Anzahl Namen: " + listOfNames.size());


        //System.out.println("Index 10 gelöscht: " + listOfNames.remove(10));


        System.out.println("Iteration mit for: ");
        for(int i = 0; i < listOfNames.size(); i++){
            System.out.println("Name: " + listOfNames.get(i));
        }

        System.out.println("Iteration mit for-each: ");
        for(Object name : listOfNames){
            System.out.println("Name: " + name);
        }

        System.out.println("Iteration mit Iterator: ");
        Iterator i = listOfNames.iterator();
        while(i.hasNext()){
            Object name = i.next();
            System.out.println("Name: " + name);
        }



        List<Integer> numbers = new ArrayList<Integer>();

        // auto-boxing --> automatisches erzeuge eines Objekts aus einfachem Datentyp
        Integer numberA = 16;
        //Integer numberAobject = new Integer(16);
        //int numberAprimitiv = 16;


        int primitivInteger = 100;

        numbers.add(16);
        numbers.add(89);
        numbers.add(primitivInteger);
        numbers.add(numberA);
        //numbers.add(89.8);
        //numbers.add(true);

        // auto-unboxing
        int numberPrimitiveA = numbers.get(1);

        for(int number : numbers){
            System.out.println(number);
        }




    }
}
