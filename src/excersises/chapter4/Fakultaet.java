package excersises.chapter4;

public class Fakultaet {

    public static void main(String[] args) {

        int fakultaet = 5;
        int result = 1;

        for(int i = 1; i <= fakultaet; i++){
            result = result * i;
        }

        // Alternative
        result = 1;
        while(fakultaet > 0){
            result = result * fakultaet--;
        }

        System.out.println("Fakultät ist " + result);

    }
}
