package lecture.chapter9;

import javax.swing.*;

public class MyFirstUI {

    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My first UI");

        myFrame.add(new JLabel("Herzlich Willkommen!"));

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}
