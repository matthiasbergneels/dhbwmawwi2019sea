package excersises;

public class TrueOrFalse {
    public static void main(String[] args) {
        short a = 3; short b = 2; boolean z = true;
        System.out.println("1. " + ( a == 2 * b - 3 ));
        System.out.println("2. " + ( a % b == b % a - 1 ));
        System.out.println("3. " + ( z && (a + b % 3 == 3)));
        System.out.println("4. " + ( ++a % b++ == 0));
        System.out.println("5. " + ( a++ % b == 0 ));
        System.out.println("6. " + ( (a + 5) % (2*b--+1)==a));
        System.out.println("7. Wert von a: " + a++);
        System.out.println("8. Wert von b: "+ ++b);




    } }
