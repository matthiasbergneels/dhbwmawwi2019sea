package lecture.chapter3;

public class ReferenceDataTypeExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Call by value
        b = a;

        a = 7;

        System.out.println(b);


        int[] numbers = {15, 78, 79, 100};

        int[] numbers2 = {78, 89, 19, 100};



        // Call by Reference
        numbers2 = numbers;

        numbers[0] = 200;

        a = numbers[0] * numbers2[0];

        System.out.println(numbers2[0]);


    }
}
