/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author studhaal
 */
public class SwingMenu extends JFrame {

    private static JFrame frame;
    private int numClicks = 0;

    public static void main(String[] args) {
        frame = new SwingMenu();
    }

    public SwingMenu() {
        super("Swing Menu Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        JMenu menuHelp = new JMenu("Help");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileOpen = new JMenuItem("Open");
        JMenuItem miFileExit = new JMenuItem("Exit");
        JMenuItem miHelpAbout = new JMenuItem("About");

        JButton button = new JButton("Count button clicks");
        final JLabel label = new JLabel("Number Clicks: " + numClicks);
        setLayout(new GridLayout(0, 1));

        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(Box.createHorizontalGlue());
        panel.add(button);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(label);

        Container contentPanel = getContentPane();
        contentPanel.add(panel, BorderLayout.CENTER);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                numClicks++;
                label.setText("Number Clicks: " + numClicks);
            }
        });

        menuFile.add(miFileNew);
        menuFile.add(miFileOpen);
        menuFile.addSeparator();
        menuFile.add(miFileExit);
        menuBar.add(menuFile);

        menuHelp.add(miHelpAbout);
        menuBar.add(menuHelp);

        miFileExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        miHelpAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Copyright 2010 Hochschule Luzern, Technik & Architektur");
            }
        });

        setJMenuBar(menuBar);

        pack();
        setVisible(true);
    }
}
