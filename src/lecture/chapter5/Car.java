package lecture.chapter5;

public class Car {

    private int doors;
    private int wheels;
    private String color;
    private String licensePlate;
    private boolean locked;


    Car(int doors, int wheels, String color){
        // dry - don't repeat yourself
        this.setDoors(doors);
        this.setWheels(wheels);
        this.setColor(color);
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

    public String getColor(){
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

    protected void setColor(String color){
        if(color.equals("pink") || color.equals("grün") || color.equals("schwarz")){
            this.color = color;
        }else{
            this.color = "schwarz";
        }

    }
}
