package lecture.chapter6;

public class Farm {

    public static void main(String[] args) {

        /*
        animal is abstract --> can't be instanciated

        Animal myAnimal = new Animal(35.5f, "Ein Tier", 50.0f);

        myAnimal.move();
        myAnimal.eat();
        myAnimal.breath();
        //myAnimal.tweet(); --> only Bird
        //myAnimal.bark(); --> only Dog
         */

        Dog myDog = new Dog(45.0f, "Bello", 15.0f, "Husky");

        myDog.move();
        myDog.eat();
        myDog.breath();
        myDog.bark();
        //myDog.tweet(); --> only Bird

        myDog.eat(5.0f);

        Bird myBird = new Bird(9.0f, "Tweety", 5.0f, true);

        myBird.move();
        myBird.eat();
        myBird.breath();
        myBird.tweet();
        //myBird.bark(); --> only Dog

        // Cast of reference variables
        Animal myAnimal = myDog; // narrowing cast --> reduction of sight

        myAnimal.breath();
        myAnimal.eat();
        myAnimal.move();
        //myAnimal.bark();

        Dog anotherDog = (Dog)myAnimal; // widening cast

        Animal[] animalShelter = new Animal[5];

        animalShelter[0] = myDog;
        animalShelter[1] = new Dog(45.0f, "Hasso", 15.0f, "Husky");
        animalShelter[2] = new Dog(45.0f, "Fiffi", 15.0f, "Husky");
        animalShelter[3] = myBird;
        animalShelter[4] = new Dog(45.0f, "Wuffi", 15.0f, "Husky");

        for(Animal currentAnimal : animalShelter){
            currentAnimal.breath();
            currentAnimal.move();
            currentAnimal.eat();

            System.out.println(currentAnimal.toString());

            if(currentAnimal instanceof Dog){
                // widening cast
                Dog currentDog = (Dog)currentAnimal;
                currentDog.bark();
            }else{
                System.out.println("kein Hund!");
            }

        }
    }
}
