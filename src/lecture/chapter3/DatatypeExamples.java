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

        int[] numbers2 = {672, 778, 622, 782, 981, 782};

        System.out.println(numbers2.length);

        char[][] tictactoe = new char[3][3];

        tictactoe[1][1] = 'X';

        String[][] sentences = new String[10][];

        sentences[0] = new String[3];

        sentences[0][0] = "Ich";
        sentences[0][1] = "habe";
        sentences[0][2] = "hunger";

        sentences[1] = new String[5];

        sentences[1][0] = "Ich";
        sentences[1][1] = "will";
        sentences[1][2] = "nicht";
        sentences[1][3] = "viel";
        sentences[1][4] = "lernen";


        String[][] sentences2 = {{"Ich", "habe", "hunger"}, {"Ich", "will", "nicht", "viel", "lernen"}};
    }
}
