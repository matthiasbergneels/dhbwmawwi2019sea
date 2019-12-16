package lecture.chapter6;

public class Animal {

    private float height;
    private String description;
    private float weight;

    public Animal(float height, String description, float weight){
        this.height = height;
        this.description = description;
        this.weight = weight;
    }


    public void eat(){
        System.out.println("Das Tier " + description + " frisst!");
    }

    public void move(){
        System.out.println("Das Tier " + description + " bewegt sich!");
    }

    public void breath(){
        System.out.println("Das Tier " + description + " atmet!");
    }

}
