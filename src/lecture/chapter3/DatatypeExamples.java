package lecture.chapter3;

public class DatatypeExamples {

    public static void main(String[] args) {


        int number = 16;

        int numberA;

        numberA = 32768;

        short shortNumberA;


        shortNumberA = (short)numberA;

        System.out.println(shortNumberA);

        numberA = shortNumberA;

        System.out.println(numberA);

        String text = "Hier \"steht\" ein Text \n der sehr \t lang ist \\ \u2764";

        System.out.println(text);

        char oneSign = '\u2764';

        //oneSign = 99;

        double newNumber = 187.5D;
        float newNumber2 = 111.5F;

        System.out.println(oneSign);


        int number8 = 015;
        int number10 = 15;
        int number16 = 0x1B;

        System.out.println(number8);
        System.out.println(number10);
        System.out.println(number16);

        long largeNumber = 2728192000000L;

        boolean boring = true; // false;


        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 56;

        numbers[4] = 177;

        //numbers = new int[10];

        //numbers[5] = 178;


        System.out.println(numbers[3]);

        System.out.println(numbers.length);

        System.out.println(args.length);

    }
}
