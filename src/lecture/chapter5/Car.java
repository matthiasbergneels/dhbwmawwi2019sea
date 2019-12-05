package lecture.chapter5;

public class Car {

    private int doors;
    private int wheels;
    public Colors color;
    private String licensePlate;
    private boolean locked;

    private static int carCounter = 0;

    /*
    public static final String COLOR_RED = "red";
    public static final String COLOR_BLACK = "black";
    public static final String COLOR_GREEN = "green";
    */

    public static final String[] COLORS = {"red", "black", "green"};

    public Car(int doors, int wheels, Colors color){
        carCounter++;
        // dry - don't repeat yourself
        this.setDoors(doors);
        this.setWheels(wheels);
        this.color = color;

        this.licensePlate = "HD-XX " + (1000 + carCounter);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    void drive(){
        System.out.println("auto ("+ licensePlate + ") fährt... brum brum " + color);
    }


    public int getDoors(){
        return this.doors;
    }

    public int getWheels(){
        return this.wheels;
    }

    public Colors getColor(){
        return this.color;
    }

    protected void setDoors(int doors){
        if(doors > 0 && doors < 6){
            this.doors = doors;
        }else{
            this.doors = 3;
        }
    }

    protected void setWheels(int wheels){
        if(wheels > 2 && wheels < 9){
            this.wheels = wheels;
        }else{
            this.wheels = 4;
        }

    }

    /*
    protected void setColor(String color){

        if(color.equals("pink") || color.equals("grün") || color.equals("schwarz")){
            this.color = color;
        }else{
            this.color = "schwarz";
        }



        for(String colorTest : COLORS){

        }
    }
    */

    public static int getCarCounter(){
        return carCounter;
    }

    protected void finalize(){
        carCounter--;
        System.out.println("Auto wird verschrottet");
    }
}
