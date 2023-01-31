package org.javagui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener {
    private int count = 0;
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel label = new JLabel("Number of Clicks: 0");
    private JButton shop = new JButton("Shop");
    private JButton clicker = new JButton("Click Me");
    protected Game(){
        panel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
        panel.setLayout(new GridLayout(2, 3));

        clicker.setFocusable(false);
        panel.add(clicker);
        panel.add(label);
        panel.add(shop);

        clicker.addActionListener(this::actionPerformed);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Control Gui");
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clicker) {
            count++;
            label.setText("Number of Clicks: " + count);
        }
    }
}
