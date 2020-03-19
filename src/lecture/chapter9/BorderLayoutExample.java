package lecture.chapter9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

    private BorderLayoutExample(){
        super("BorderLayoutExample");

        this.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel(new FlowLayout());
        northPanel.add(new JButton("North"));
        northPanel.add(new JButton("New North"));

        this.add(new JButton("Center"), BorderLayout.CENTER);
        this.add(northPanel, BorderLayout.NORTH);
        this.add(new JButton("SouthSouthSouthSouthSouthSouthSouthSouth"), BorderLayout.SOUTH);
        this.add(new JButton("EastEastEastEastEastEastEastEastEastEast"), BorderLayout.EAST);
        this.add(new JButton("West"), BorderLayout.WEST);

        this.add(new JButton("new Generic"));



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }

}
