package excersises.chapter9.meldeamt;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeldeamtUI extends JFrame {

    private static final String ACTION_ADD = "ADD";
    private static final String ACTION_SHOW = "SHOW";
    private static final String ACTION_SEARCH = "SEARCH";
    private static final String ACTION_DELETE = "DELETE";
    private static final String ACTION_SHOWLIST = "SHOWLIST";
    private static final String ACTION_CLOSE = "CLOSE";

    private JLabel lblNotifications;
    private JComboBox<String> cbbTitle;
    private JTextField tfName;
    private JTextField tfVorname;
    private JTextField tfGebName;
    private JTextField tfEmail;
    private ButtonGroup maritalGroup;

    private String currentMaritalStatus = Einwohner.FAMILIENSTAND_VERHEIRATET;

    public MeldeamtUI(String title) {
        super(title);

        this.setLayout(new BorderLayout());

        // ActionListener - Buttons
        ActionListener btnListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String action = e.getActionCommand();
                if (action.equals(ACTION_ADD)) {

                    boolean erg = Listenoperationen
                            .hinzufuegen(tfName.getText(), tfVorname.getText(),
                                    tfGebName.getText(), tfEmail.getText(),
                                    cbbTitle.getSelectedItem().toString(),
                                    currentMaritalStatus);
                    if (erg) {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText()
                                + " erfolgreich hinzugefügt!");
                    } else {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText()
                                + " NICHT erfolgreich hinzugefügt!");
                    }
                } else if (action.equals(ACTION_SHOW)) {
                    boolean erg = Listenoperationen.anzeigen(tfName.getText(),
                            tfVorname.getText());
                    if (erg) {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " angezeigt!");
                    } else {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " NICHT angezeigt!");
                    }
                } else if (action.equals(ACTION_SEARCH)) {
                    boolean erg = Listenoperationen.suchen(tfName.getText(),
                            tfVorname.getText());
                    if (erg) {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " gefunden!");
                    } else {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " NICHT gefunden!");
                    }
                } else if (action.equals(ACTION_DELETE)) {
                    boolean erg = Listenoperationen.loeschen(tfName.getText(),
                            tfVorname.getText());
                    if (erg) {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " gelöscht!");
                    } else {
                        lblNotifications.setText("Einwohner "
                                + tfName.getText() + " NICHT gefunden!");
                    }
                } else if (action.equals(ACTION_SHOWLIST)) {
                    Listenoperationen.listeAusgeben();
                } else if (action.equals(ACTION_CLOSE)) {
                    System.exit(0);
                }


            }
        };

        // Action Listener - RadioButtonGroup Familienstand
        ActionListener rbgMaritalStatus = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                JRadioButton btn = (JRadioButton) arg0.getSource();

                currentMaritalStatus = btn.getText();

                if (btn.isSelected()) {
                    if (btn.getText().equals(Einwohner.FAMILIENSTAND_LEDIG)) {
                        tfGebName.setText("");
                        tfGebName.setEditable(false);
                    } else {
                        tfGebName.setEditable(true);
                    }

                }

            }
        };

        // Panels im BorderLayout
        JPanel northPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        // "Eingedrückter" Centerbereich
        Border loweredBevelBorder = BorderFactory
                .createBevelBorder(BevelBorder.LOWERED);
        centerPanel.setBorder(loweredBevelBorder);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(centerPanel, BorderLayout.CENTER);

        // North Panel - Leiste für Meldungen
        lblNotifications = new JLabel("");
        northPanel.add(lblNotifications);

        // Center Panel - Eingabebereich
        Border etchedBorder = BorderFactory.createEtchedBorder();

        // Kontaktdaten
        JPanel contactDataPanel = new JPanel(new GridLayout(0, 2));
        Border contactEtchedBorder = BorderFactory.createTitledBorder(
                etchedBorder, "Kontaktdaten");
        contactDataPanel.setBorder(contactEtchedBorder);
        centerPanel.add(contactDataPanel);

        String[] titleValues = { Einwohner.ANREDE_FRAU, Einwohner.ANREDE_HERR, Einwohner.ANREDE_DIVERS };

        cbbTitle = new JComboBox<String>(titleValues);
        tfName = new JTextField(20);
        tfName.setText("Mustermann");
        tfVorname = new JTextField(20);
        tfVorname.setText("Mimi");
        tfGebName = new JTextField(20);
        tfGebName.setText("Musterfrau");
        tfEmail = new JTextField(20);
        tfEmail.setText("mimi.mustermann@email.de");

        contactDataPanel.add(new JLabel("Anrede:"));
        cbbTitle.setToolTipText("Anrede auswählen");
        contactDataPanel.add(cbbTitle);
        contactDataPanel.add(new JLabel("Name:"));
        tfName.setToolTipText("Nachname eingeben - z.B. \"Mustermann\"");
        contactDataPanel.add(tfName);
        contactDataPanel.add(new JLabel("Vorname:"));
        contactDataPanel.add(tfVorname);
        contactDataPanel.add(new JLabel("Geburtsname:"));
        contactDataPanel.add(tfGebName);
        contactDataPanel.add(new JLabel("E-Mail:"));
        contactDataPanel.add(tfEmail);

        // Familienstand
        JPanel maritalStatusPanel = new JPanel(new GridLayout(0, 1));
        Border maritalEtchedBorder = BorderFactory.createTitledBorder(
                etchedBorder, "Familienstand");
        maritalStatusPanel.setBorder(maritalEtchedBorder);
        centerPanel.add(maritalStatusPanel);

        maritalGroup = new ButtonGroup();

        JRadioButton rbtL = new JRadioButton(Einwohner.FAMILIENSTAND_LEDIG);
        JRadioButton rbtVH = new JRadioButton(
                Einwohner.FAMILIENSTAND_VERHEIRATET);
        JRadioButton rbtVW = new JRadioButton(Einwohner.FAMILIENSTAND_VERWITWET);
        JRadioButton rbtG = new JRadioButton(Einwohner.FAMILIENSTAND_GESCHIEDEN);

        rbtVH.setSelected(true);

        maritalGroup.add(rbtL);
        rbtL.addActionListener(rbgMaritalStatus);
        maritalGroup.add(rbtVH);
        rbtVH.addActionListener(rbgMaritalStatus);
        maritalGroup.add(rbtVW);
        rbtVW.addActionListener(rbgMaritalStatus);
        maritalGroup.add(rbtG);
        rbtG.addActionListener(rbgMaritalStatus);

        maritalStatusPanel.add(rbtL);
        maritalStatusPanel.add(rbtVH);
        maritalStatusPanel.add(rbtVW);
        maritalStatusPanel.add(rbtG);

        // South Panel - Leiste für Buttons

        JButton btnAdd = new JButton("Hinzufügen");
        btnAdd.setActionCommand(ACTION_ADD);
        btnAdd.addActionListener(btnListener);

        JButton btnShow = new JButton("Anzeigen");
        btnShow.setActionCommand(ACTION_SHOW);
        btnShow.addActionListener(btnListener);

        JButton btnSearch = new JButton("Suchen");
        btnSearch.setActionCommand(ACTION_SEARCH);
        btnSearch.addActionListener(btnListener);

        JButton btnDelete = new JButton("Löschen");
        btnDelete.setActionCommand(ACTION_DELETE);
        btnDelete.addActionListener(btnListener);

        JButton btnShowList = new JButton("Liste Anzeigen");
        btnShowList.setActionCommand(ACTION_SHOWLIST);
        btnShowList.addActionListener(btnListener);


        southPanel.add(btnAdd);
        southPanel.add(btnShow);
        southPanel.add(btnSearch);
        southPanel.add(btnDelete);
        southPanel.add(btnShowList);



        JMenuItem menuItemAdd = new JMenuItem("Hinzufügen");
        menuItemAdd.setActionCommand(ACTION_ADD);
        menuItemAdd.addActionListener(btnListener);

        JMenuItem menuItemDelete = new JMenuItem("Löschen");
        menuItemDelete.setActionCommand(ACTION_DELETE);
        menuItemDelete.addActionListener(btnListener);

        JMenuItem menuItemClose = new JMenuItem("Schliessen");
        menuItemClose.setActionCommand(ACTION_CLOSE);
        menuItemClose.addActionListener(btnListener);

        JMenu general = new JMenu("Allgemein");
        general.add(menuItemAdd);
        general.add(menuItemDelete);
        general.addSeparator();
        general.add(menuItemClose);


        JMenuItem menuItemSearch = new JMenuItem("Suchen");
        menuItemSearch.setActionCommand(ACTION_SEARCH);
        menuItemSearch.addActionListener(btnListener);

        JMenuItem menuItemShowList = new JMenuItem("Liste augeben");
        menuItemShowList.setActionCommand(ACTION_SHOWLIST);
        menuItemShowList.addActionListener(btnListener);

        JMenu listFunctions = new JMenu("Listenfunktionen");
        listFunctions.add(menuItemSearch);
        listFunctions.add(menuItemShowList);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(general);
        menuBar.add(listFunctions);

        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        //Listenoperationen.readSetFromFile();
        new MeldeamtUI("Einwohnermeldeamt");


    }

}