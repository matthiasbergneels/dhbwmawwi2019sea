package lecture.chapter3;

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

        String result = "" + x + a + text1 + " " + text2 + (a - x);
        System.out.println(result);

    }
}
