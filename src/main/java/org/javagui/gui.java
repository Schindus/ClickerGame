package org.javagui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JButton settings = new JButton("Settings");
    private JButton starten = new JButton("Starten");
    Graphics g;

    public gui() {
        panel.setSize(500, 500);

        starten.setFocusable(false);
        settings.setFocusable(false);
        panel.add(starten);
        panel.add(settings);


        starten.addActionListener(this::actionPerformed);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Control Gui");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new gui();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == starten) {
            frame.dispose();
            new Game();
        }
    }
}
