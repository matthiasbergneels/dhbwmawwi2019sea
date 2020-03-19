package lecture.chapter9;

import javax.swing.*;
import java.awt.*;

public class MyFirstUI {

    public static void main(String[] args) {

        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("Screen Dimension: " + screenDimension.getWidth() + " x " + screenDimension.getHeight());

        JFrame myFrame = new JFrame("My first UI");

        //myFrame.getContentPane().add()
        myFrame.add(new JLabel("Herzlich Willkommen!"));

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setBounds(100, 100, (int)(screenDimension.getWidth() / 2), 200);
        //myFrame.pack();
        myFrame.setVisible(true);


    }
}
