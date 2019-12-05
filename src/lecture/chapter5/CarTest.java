package lecture.chapter5;

public class CarTest {

    public static void main(String[] args) {

        System.out.println("Anzahl Autos: " + Car.getCarCounter());

        Car myCar = new Car(100, 4, Colors.RED);

        myCar.setDoors(10);
        myCar.setWheels(100);
        //myCar.setColor("gelb");
        //myCar.licensePlate = "HD-XX 1234";

        myCar.color = Colors.BLACK;

        Car yourCar = new Car(3, 6, Colors.BLACK);
        //yourCar.color = "grün";


        System.out.println("Mein Auto ist " + myCar.getColor());
        System.out.println("Dein Auto ist " + yourCar.getColor());

        System.out.println("Dein Auto hat " + yourCar.getDoors() + " Türen");

        myCar.drive();
        yourCar.drive();

        System.out.println("Anzahl Autos: " + Car.getCarCounter());



        myCar = new Car(2, 4, Colors.BLACK);
        yourCar = null;

        System.gc();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Anzahl Autos: " + Car.getCarCounter());

    }
}
