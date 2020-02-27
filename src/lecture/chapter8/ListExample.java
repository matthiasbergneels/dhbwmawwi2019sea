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



    }
}
