package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorJFrame extends JFrame {
    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;

    public ColorJFrame() {
        super("Using JColor");
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);
        changeColorButton = new JButton("Change Color");
        changeColorButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(ColorJFrame.this, "Choose color", color);
                        if (color == null)
                            color = Color.LIGHT_GRAY;
                        colorJPanel.setBackground(color);
                    }
                });
        add(colorJPanel,BorderLayout.CENTER);
        add(changeColorButton,BorderLayout.SOUTH);
        setSize(500,500);
        setVisible(true);
    }
}
