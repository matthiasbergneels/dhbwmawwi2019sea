package excersises.chapter5.hausbau;

public class HausTest {
    public static void main(String[] args) throws Exception {

        System.out.println("Anzahl Häuser: " + Haus.getObjCnt());

        // Haeuser bauen
        Haus[] haeuser = {	new Haus(5),
                new Haus("Hauptstrasse", "167A", 89872, "Wumshausen"),
                new Haus(3, 18, 3, 234, true)};

        System.out.println("Anzahl Häuser: " + Haus.getObjCnt());


        for(Haus haus : haeuser){
            System.out.println(haus);
        }

        // Haeuser abreissen
        haeuser[0] = null;
        haeuser[2] = null;

        // Garbage Collector anfragen
        System.gc();
        // Auf GC warten
        try {
            Thread.sleep(3000);
        } catch(Exception e){
            System.out.println("Ausnahmebehandlung für Thread.sleep()");
        }

        System.out.println("Anzahl Häuser: " + Haus.getObjCnt());

    }
}
