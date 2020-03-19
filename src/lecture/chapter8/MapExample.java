package lecture.chapter8;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> colorCodes = new HashMap<String, String>();

        colorCodes.put("BLACK", "#000000");
        colorCodes.put("WHITE", "#FFFFFF");
        colorCodes.put("RED", "#FF0000");
        colorCodes.put("GREEN", "#00FF00");


        System.out.println("Farbcode für RED: " + colorCodes.get("RED"));

        System.out.println("Farbcode für BLUE enthalten: " + colorCodes.containsKey("BLUE"));

        Set<String> colorKeys = colorCodes.keySet();

        Iterator<String> i = colorKeys.iterator();
        while(i.hasNext()){
            String colorKey = i.next();
            System.out.println("Farbcode für " + colorKey + ": " + colorCodes.get(colorKey) + " - HashCode: " + colorKey.hashCode());
        }


        Collection<String> colorValues = colorCodes.values();

        for(String colorCode : colorValues){
            System.out.println("Farbcode: " + colorCode);
        }


    }

}

