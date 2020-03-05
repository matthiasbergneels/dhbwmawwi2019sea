package lecture.chapter8;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> setOfNames = new TreeSet<String>();

        setOfNames.add("Karl");
        setOfNames.add("Gabi");
        setOfNames.add("Michael");
        setOfNames.add("Gabi");
        setOfNames.add("Zeus");
        setOfNames.add("Adam");

        System.out.println("Anzahl Namen: " + setOfNames.size());

        System.out.println("Iteration mit For-Each:");
        for(String name : setOfNames){
            System.out.println(name);
        }

    }
}
