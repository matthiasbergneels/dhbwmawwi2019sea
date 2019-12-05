package lecture.chapter5;

public class Student {

    private float amountDrunk = 0;
    private float promille = 0;

    public void drink(float amount){
        amountDrunk += amount;
        System.out.println("Trinkt " + amount + " ml");
    }


    public void drink(double amount, float alcoholInPercentage){
        drink((float)amount);
        // TODO: modify promille depending on alcoholInPercentage
        System.out.println("und wird betrunken...");
    }

    public void drink(float amount, double toxicInPercentage){
        System.out.println("Tot!");
    }


}
