package lecture.chapter4;

public class Increment {
    public static void main(String[] args) {


        int x = 10;

        int a = x++ + x++ + x++;

        System.out.println("A: " + a);
        System.out.println("X: " + x);
    }
}
