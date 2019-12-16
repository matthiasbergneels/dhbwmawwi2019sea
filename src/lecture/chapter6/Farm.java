package lecture.chapter6;

public class Farm {

    public static void main(String[] args) {

        Animal myAnimal = new Animal(35.5f, "Ein Tier", 50.0f);

        myAnimal.move();
        myAnimal.eat();
        myAnimal.breath();
        //myAnimal.tweet(); --> only Bird
        //myAnimal.bark(); --> only Dog


        Dog myDog = new Dog(45.0f, "Bello", 15.0f, "Husky");

        myDog.move();
        myDog.eat();
        myDog.breath();
        myDog.bark();
        //myDog.tweet(); --> only Bird

        Bird myBird = new Bird(9.0f, "Tweety", 5.0f, true);

        myBird.move();
        myBird.eat();
        myBird.breath();
        myBird.tweet();
        //myBird.bark(); --> only Dog

    }
}
