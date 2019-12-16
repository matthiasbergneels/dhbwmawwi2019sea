package lecture.chapter6;

public class Dog extends Animal {

    private String breed;

    public Dog(float height, String description, float weight, String breed) {
        super(height, description, weight);
        this.breed = breed;
    }

    public void bark(){
        System.out.println("Der Hund bellt zwischen " + getAnimalCounter() + " Tieren!");
    }

    // override eat method from Animal
    @Override
    public void eat(){
        System.out.println("Der Hund frisst Fleisch!");
    }

    // overload eat method from Animal
    public void eat(float amount){
        super.eat();
        System.out.println("... " + amount + " Fleisch.");
    }

    @Override
    public void breath() {
        System.out.println("Der Hund atmet!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Rasse: " + this.breed;
    }
}
