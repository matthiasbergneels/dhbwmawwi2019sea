package excersises.chapter4;

public class Ggt {

    public static void main(String[] args) {

        int numberA = 245;
        int numberB = 63;

        while(numberA != numberB){

            if(numberA > numberB){
                //numberA -= numberB;
                numberA = numberA - numberB;
            }else{
                //numberB -= numberA;
                numberB = numberB - numberA;
            }

            // Alternativ - ? Operator
            //int result = (numberA > numberB) ? (numberA -= numberB) : (numberB -= numberA);
        }

        System.out.println("Der GGT ist " + numberA);

    }
}
