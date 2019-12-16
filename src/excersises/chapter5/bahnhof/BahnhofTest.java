package excersises.chapter5.bahnhof;

import excersises.chapter6.Kiste;
import excersises.chapter6.Tonne;

public class BahnhofTest {
    public static void main(String[] args) {


        Fracht[] ladung = {	new Fracht("Zeug", 1007.0, "Pappe"),
                new Fracht("Mehr Zeug", 678.0, "Plastik"),
                new Fracht("Flüssiges Zeug", 500.0, "Fass"),
                new Tonne("noch mehr flüssiges Zeug", 678.0, 100, 45),
                new Kiste("Magazine", 600, 50, 60, 32)};

        Gueterwagon meinWagon = new Gueterwagon(1678, "Kastenwagon", (byte)6);

        meinWagon.setFracht(ladung);

        Zuglokomotive meineLok = new Zuglokomotive(1987, "Spezielle Lok", "Solar", (byte)10);

        Gueterwagon[] wagons = {meinWagon};
        Gueterzug meinZug = new Gueterzug(meineLok, wagons, 19892, 1);

        Gueterzug nochEinZug = new Gueterzug(1892, 3);


        meinZug.setFahrer(new Zugfuehrer("Müller", "Klaus", 18982));

        nochEinZug.fahren();
        meinZug.fahren();

        System.out.println("Informationen über meinZug:");
        System.out.println("Gueterzug: " + meinZug.getAnzWagons() + meinZug.getNummer());
        System.out.println("Fahrer: " + meinZug.getFahrer().getName() + ", " + meinZug.getFahrer().getVorname());
        System.out.println("Lokomotive: " + meinZug.getLok().getNummer() + ", " + meinZug.getLok().getAntrieb());

    }
}
