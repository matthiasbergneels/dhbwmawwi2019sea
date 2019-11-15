package lecture.chapter4;

public class SwitchCaseStatement {

    public static void main(String[] args) {

        int grade = 1;

        switch(grade){
            case 1: {
                System.out.println("Sehr gut");
                break;
            }
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            default:
                System.out.println("Keine gültige Note!");
                break;
        }


    }
}
