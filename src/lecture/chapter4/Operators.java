package lecture.chapter4;

public class Operators {

    public static void main(String[] args) {

        int x = 1;

        // alternative: x = x + 1;
        x++;

        int a = x++ + x++ + x++;

        System.out.println(a);
        System.out.println(x);


        // alternative: a = a + 5;
        a += 5;


        // Stringverkettungen

        String text1 = "Hallo";
        String text2 = "Peter";

        String result = x + a + text1 + " " + text2 + (a - x);
        System.out.println(result);




        int numberA = 9;
        int numberB = 2;

        double resultingNumber = (double)numberA / numberB;

        System.out.println(resultingNumber);


        String text3 = "Hallo";
        String text4 = "Klaus";
        //String text5 = "Hallo";
        String text5 = new String("Hallo");

        if(text3 == text5){
            System.out.println(text3 + " ist gleich " + text5);
        }else{
            System.out.println(text3 + " ist nicht gleich " + text5);
        }

        if(text3.equals(text5)){
            System.out.println(text3 + " ist gleich " + text5);
        }else{
            System.out.println(text3 + " ist nicht gleich " + text5);
        }

    }
}
