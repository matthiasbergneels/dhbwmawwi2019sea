package lecture.chapter9;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

    private FlowLayoutExample(){
        super("Flow Layout Example");

        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.add(new JLabel("Flow Layout Example"));
        this.add(new JButton("Drück mich!"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }


    public static void main(String[] args) {
        new FlowLayoutExample();
    }

}
