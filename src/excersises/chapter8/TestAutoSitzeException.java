package excersises.chapter8;

public class TestAutoSitzeException {

    public static void main(String[] args) {

        try {
            AutoSitz validSeat1 = new AutoSitz(false, "rot");
            AutoSitz validSeat2 = new AutoSitz(true, "schwarz");
            AutoSitz validSeat3 = new AutoSitz(true, "blau");
        } catch(FalscheParameter e){
            System.out.println(e.getMessage());

        }
    }
}
