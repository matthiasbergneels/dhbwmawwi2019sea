package lecture.chapter4;

import javax.swing.*;

public class IFStatement {

    public static void main(String[] args) {

        boolean tired = false;

        if(tired){
            System.out.println("Ich bin müde");
            System.out.println("Würde lieber schlafen");
        }else {
            System.out.println("Ich bin hell wach");
        }


        System.out.println("Sitze aber in der Vorlesung");


        int grade = 1;

        if(grade > 3 && grade <= 4){
            System.out.println("Das war knapp");
        }else if(grade > 2 && grade <= 3){
            System.out.println("Könnte besser sein");
        }else if(grade >= 1 && grade <= 2){
            System.out.println("Das ist gut gelaufen");
        }else{
            System.out.println("Verdammt...");
        }

    }
}
