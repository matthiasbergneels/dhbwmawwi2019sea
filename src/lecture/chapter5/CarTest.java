package lecture.chapter5;

public class CarTest {

    public static void main(String[] args) {

        Car myCar = new Car(100, 4, "pink");

        myCar.setDoors(10);
        myCar.setWheels(100);
        myCar.setColor("gelb");
        //myCar.licensePlate = "HD-XX 1234";


        Car yourCar = new Car(3, 6, "grün");
        //yourCar.color = "grün";


        System.out.println("Mein Auto ist " + myCar.getColor());
        System.out.println("Dein Auto ist " + yourCar.getColor());

        System.out.println("Dein Auto hat " + yourCar.getDoors() + " Türen");

        myCar.drive();
        yourCar.drive();

    }
}
