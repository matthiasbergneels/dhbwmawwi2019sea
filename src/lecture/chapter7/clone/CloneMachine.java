package lecture.chapter7.clone;

public class CloneMachine {

    public static void main(String[] args) {

        Sheep dolly1 = new Sheep("Dolly", 5);



        try {
            Sheep dolly2 = dolly1.clone();
            System.out.println(dolly1 + " " + dolly1.name + ", " + dolly1.age);
            System.out.println(dolly2 + " " + dolly2.name + ", " + dolly2.age);

            dolly2.name = "Gabi";


            System.out.println(dolly1 + " " + dolly1.name + ", " + dolly1.age);
            System.out.println(dolly2 + " " + dolly2.name + ", " + dolly2.age);
        }catch(Exception e){
            System.out.println("Klonen ist schief gegangen - beide Schafe tot!");
        }


    }
}
