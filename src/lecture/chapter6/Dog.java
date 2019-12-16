package lecture.chapter6;

public class Dog extends Animal {

    private String breed;


    public Dog(float height, String description, float weight, String breed) {
        super(height, description, weight);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Der Hund bellt!");
    }
}
