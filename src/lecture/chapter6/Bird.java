package lecture.chapter6;

public class Bird extends Animal {

    private boolean flyable;

    public Bird(float height, String description, float weight, boolean flyable){
        super(height, description, weight);
        this.flyable = flyable;
    }


    public void tweet(){
        System.out.println("Der Vogel zwitschert!");
    }

}
