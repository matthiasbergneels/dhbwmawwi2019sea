package lecture.chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InteractiveUI extends JFrame {

    private final String ACTION_COMMAND_CLOSE = "CLOSE";

    private InteractiveUI(){
        super("Flow Layout Example");

        this.setLayout(new FlowLayout(FlowLayout.RIGHT));

        this.add(new JLabel("Flow Layout Example"));

        JButton pressMeButton = new JButton("Drück mich!");
        JButton closeButton = new JButton("Schliessen");

        /* Action Listener as Inner Class
        ActionListener buttonActionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button wurde gedrückt!");
                System.out.println("Action Command: " + e.getActionCommand());
                System.out.println("Source: " + e.getSource());
                System.out.println("Id: " + e.getID());

                if(e.getActionCommand().equals(ACTION_COMMAND_CLOSE)){
                    System.exit(0);
                }
            }
        };
        */

        // Action Listener as Lambda Function
        ActionListener buttonActionListener = (ActionEvent e) -> {
            System.out.println("Button wurde gedrückt!");
            System.out.println("Action Command: " + e.getActionCommand());

            if(e.getActionCommand().equals(ACTION_COMMAND_CLOSE)){
                System.exit(0);
            }else{
                openSecondJFrame();
            }
        };


        pressMeButton.addActionListener(buttonActionListener);
        closeButton.addActionListener(buttonActionListener);
        closeButton.setActionCommand(ACTION_COMMAND_CLOSE);

        this.add(pressMeButton);
        this.add(closeButton);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    private void openSecondJFrame(){
        System.out.println("Open new Frame");
    }


    public static void main(String[] args) {
        new InteractiveUI();
    }


}
