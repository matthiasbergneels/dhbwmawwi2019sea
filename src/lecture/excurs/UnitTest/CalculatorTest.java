package lecture.excurs.UnitTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static private Calculator testCalculator;

    @BeforeAll
    static void initialSetup(){
        System.out.println("Läuft einmal vor allen Tests");
        testCalculator = new Calculator();
    }

    @BeforeEach
    void setUp() {
        System.out.println("Läuft vor jedem Test einmal");
    }

    @Test
    void add1() {
        System.out.println("Test für Add");

        int erg = testCalculator.add(5, 10);
        Assertions.assertEquals(15, erg);
    }

    @Test
    void add2() {
        System.out.println("Test für Add");

        int erg = testCalculator.add(8, 9);
        assertEquals(17, erg);
    }

    @Test
    void addIntOverflow() {
        System.out.println("Test für Add");

        int erg = testCalculator.add(2000000000, 2000000000);
        assertEquals(-294967296, erg);
    }

    @DisplayName("Substract one - positive result")
    @Test
    void subtract() {
        int erg = testCalculator.subtract(10, 5);
        assertEquals(5, erg);
    }

    @DisplayName("Substract one - negativ result")
    @Test
    void subtractNegativ() {
        int erg = testCalculator.subtract(5, 10);
        assertEquals(-5, erg);
    }

    @Test
    void multiply() {
        int erg = testCalculator.multiply(5, 10);
        assertEquals(50, erg);
    }

    @Test
    void divide() {
        int erg = testCalculator.divide(10, 5);
        assertEquals(2, erg);

    }

    @DisplayName("Divide by Zero")
    @Test
    void divideByZero(){

        assertThrows(ArithmeticException.class, () -> {
            int erg = testCalculator.divide(10, 0);
        });

        /*try{
            int erg = testCalculator.divide(10, 0);
        }catch(Exception e){
            assertEquals("/ by zero", e.getMessage());

        }*/


    }
}