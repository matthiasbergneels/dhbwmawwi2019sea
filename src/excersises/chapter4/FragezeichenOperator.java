package excersises.chapter4;

public class FragezeichenOperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 9;

        boolean erg1 = a==b ? false : true;

        boolean erg2 = !(a==b);

        boolean erg3 = a!=b;

        System.out.println("?: " + erg1);
        System.out.println("!: " + erg2);
        System.out.println("!=: " + erg3);

    }
}
