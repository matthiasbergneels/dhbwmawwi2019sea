package excersises.chapter4;

import javax.swing.*;

public class SiebDesEratosthenes {
    public static void main(String[] args) {

        String s = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");
        int og = Integer.parseInt(s);

        boolean[] primzahlen = new boolean[og + 1];

        for(int i = 0; i < primzahlen.length; i++){
            primzahlen[i] = true;
        }

        for(int i = 2; i < primzahlen.length; i++){
            if(primzahlen[i]){
                int x = i + i;

                while(x < primzahlen.length){
                    primzahlen[x] = false;
                    x = x + i;
                }
            }
        }

        System.out.println("Primzahlen bis "  + og);
        for(int i = 2; i < primzahlen.length; i++){
            if(primzahlen[i]){
                System.out.println(i);
            }
        }

        int count = 2;
        while(count < primzahlen.length){
            if(primzahlen[count]){
                System.out.println(count);
            }
            count++;
        }
    }

}
