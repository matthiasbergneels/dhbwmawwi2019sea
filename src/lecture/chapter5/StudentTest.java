package lecture.chapter5;

public class StudentTest {

    public static void main(String[] args) {

        Student studentOne = new Student();

        studentOne.drink(500);
        studentOne.drink(250);

        studentOne.drink(10.0, 30.0f);
        studentOne.drink(50.0f, 100.0);


        // Example for overloaded Methods - println
        System.out.println("String");
        System.out.println(10);
        System.out.println();

    }
}
