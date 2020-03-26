package lecture.chapter9;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

public class Logon extends JFrame{

    private static final String COMMAND_OK = "OK";
    private static final String COMMAND_CANCEL = "CANCEL";

    private JTextField host;

    public Logon() throws ParseException{

        this.setTitle("Logon");

        String[] valueHelp = {"FTP", "Telnet", "SMTP", "HTTP"};
        JComboBox<String> myComboBox = new JComboBox<String>(valueHelp);

        myComboBox.addItemListener((ItemEvent e) -> {
            if(e.getStateChange() == ItemEvent.SELECTED){
                System.out.println("Selected item: " + e.getItem());
            }
        });

        myComboBox.addActionListener((ActionEvent e) -> {
            System.out.println(e.getActionCommand());
        });



        // initialize Panels
        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel southPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        //((FlowLayout)centerPanel.getLayout()).setHgap(20);
        //((FlowLayout)centerPanel.getLayout()).setVgap(20);


        JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
        JPanel filePanel = new JPanel(new GridLayout(0, 2));

        //((GridLayout)connectionPanel.getLayout()).setVgap(15);
        //((GridLayout)filePanel.getLayout()).setVgap(15);

        JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
        portField.setColumns(3);

        FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

        //create & assign elements for connection area
        JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("User:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(3));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Passwort:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JPasswordField(5));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Art:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(myComboBox);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Host:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        host = new JTextField(5);
        flowLayoutForCell.add(host);
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Port:"));
        connectionPanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(portField);
        connectionPanel.add(flowLayoutForCell);

        // create & add Fields for File Area
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Quelle:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JLabel("Ziel:"));
        filePanel.add(flowLayoutForCell);
        flowLayoutForCell = new JPanel(cellFlowLayout);
        flowLayoutForCell.add(new JTextField(10));
        filePanel.add(flowLayoutForCell);


        host.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("typed");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("pressed");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("released");
                System.out.println("Char: " + e.getKeyChar());
                System.out.println("KeyCode: " + e.getKeyCode());
                System.out.println("extended KeyCode: " + e.getExtendedKeyCode());
                System.out.println("Modifier: " + e.getModifiersEx());
            }
        });

        ActionListener buttonListener = (ActionEvent e) -> {
            switch (e.getActionCommand()){
                case COMMAND_OK:
                    System.out.println("OK pressed!");
                    System.out.println("Host: " + host.getText());
                    System.out.println("Port: " + portField.getText());
                    host.setText("anderes Ziel");
                    break;
                case COMMAND_CANCEL:
                    System.out.println("Cancel pressed!");
                    System.exit(0);
                    break;
            }
        };


        // create & assign Buttons
        JButton okButton = new JButton("Okay");
        okButton.setActionCommand(COMMAND_OK);
        okButton.addActionListener(buttonListener);
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setActionCommand(COMMAND_CANCEL);
        cancelButton.addActionListener(buttonListener);

        okButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                ((JButton)e.getSource()).setEnabled(false);
                System.out.println("Haha");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                ((JButton)e.getSource()).setEnabled(true);
            }
        });

        southPanel.add(okButton);
        southPanel.add(cancelButton);

        // create & assign Borders
        Border etchedBorder = BorderFactory.createEtchedBorder();
        Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
        Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
        Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        connectionPanel.setBorder(connectionBorder);
        filePanel.setBorder(fileBorder);
        centerPanel.setBorder(centerBorder);

        // combine Panels
        centerPanel.add(connectionPanel);
        centerPanel.add(filePanel);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        this.setContentPane(mainPanel);

        // set JFrame behavior
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) throws ParseException {
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();

        System.out.println("Screen Dimension: " + screenDimension.getWidth() + " x " + screenDimension.getHeight());

        new Logon();
    }

}