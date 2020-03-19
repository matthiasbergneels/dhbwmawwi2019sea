package lecture.chapter9;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame{

    private GridLayoutExample(){
        super("BorderLayoutExample");

        this.setLayout(new GridLayout(0,2));

        this.add(new JLabel("Feld 0"));
        this.add(new JLabel("Feld 1"));
        this.add(new JLabel("Feld 2"));
        this.add(new JLabel("Feld 3"));
        this.add(new JLabel("Feld 4"));
        this.add(new JLabel("Feld 5"));
        this.add(new JLabel("Feld 6"));
        this.add(new JLabel("Feld 7"));
        this.add(new JLabel("Feld 8"));
        this.add(new JLabel("Feld 9"));
        this.add(new JButton("Feld 10"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
