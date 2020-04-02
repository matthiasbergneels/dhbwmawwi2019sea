package excersises.chapter9.meldeamt;

import java.io.*;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Listenoperationen {

    private static TreeSet<Einwohner> liste = new TreeSet<Einwohner>();

    private static Einwohner ermittleObjekt(String name, String vorname){
        Einwohner e = null;

        Iterator<Einwohner> i = liste.iterator();
        while(i.hasNext()){
            e = i.next();
            if((name.equals(e.getName()) &&
                    vorname.equals(e.getVorname()))){
                return e;
            }
        }

        return null;
    }

    public static boolean hinzufuegen(String name, String vorname, String gebName, String email, String anrede, String familienstand){
        Einwohner e = new Einwohner(name, vorname, gebName, email, anrede, familienstand);
        boolean erg = liste.add(e);
        return erg;
    }

    public static boolean anzeigen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            System.out.println(e);
            return true;
        }
    }

    public static boolean suchen(String name, String vorname){

        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            return true;
        }
    }

    public static boolean loeschen(String name, String vorname){
        Einwohner e = ermittleObjekt(name, vorname);

        if(e == null){
            return false;
        }else{
            liste.remove(e);
            return true;
        }
    }

    public static void listeAusgeben(){
        if(liste.size() > 0){

            Einwohner e = null;

            System.out.println("Einwohner:");

            Iterator<Einwohner> i = liste.iterator();
            while(i.hasNext()){
                System.out.println(i.next());

            }
        }else{
            System.out.println("Die Liste ist leer!");
        }
    }
}