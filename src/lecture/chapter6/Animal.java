package lecture.chapter6;

public abstract class Animal {

    private float height;
    private String description;
    private float weight;
    protected static int animalCounter;

    public Animal(float height, String description, float weight){
        this.height = height;
        this.description = description;
        this.weight = weight;
        animalCounter++;
    }


    public void eat(){
        System.out.println("Das Tier " + description + " frisst!");
    }

    public final void move(){
        System.out.println("Das Tier " + description + " bewegt sich!");
    }

    public abstract void breath();

    @Override
    public String toString() {
        return "Beschreibung: " + this.description + ", Gewicht: " + this.weight + ", Größe: " + this.height;
    }

    public static int getAnimalCounter(){
        return animalCounter;
    }
}
