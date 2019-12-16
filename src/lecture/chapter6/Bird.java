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

    @Override
    public void breath() {
        System.out.println("Der Vogel atmet!");
    }

    @Override
    public String toString() {
        return super.toString() + ", kann fliegen: " + (flyable ? "Ja" : "Nein");
    }

    /*
    final - can't be overwritten
    public void move(){
        System.out.println("");

    }

     */
}
