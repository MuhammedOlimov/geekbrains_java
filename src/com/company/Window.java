package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    public Window(String title){
        JFrame jFrame = new JFrame(title);
        JPanel jPanel = new JPanel();
        JPanel jPanelNumber = new JPanel(new GridLayout(4, 3));
        JPanel jPanelScoreboard = new JPanel();
        JPanel jPanelCommands = new JPanel(new GridLayout(2, 2));
        JPanel jPanelResult = new JPanel();
        TextField textField = new TextField(16);
        textField.setEditable(true);

        TextField textFieldResult = new TextField(16);
        textFieldResult.setEditable(false);


        JButton jButtonPlus = new JButton("+");
        jButtonPlus.addActionListener(new ButtonListener(textField, textFieldResult));
        JButton jButtonMinus = new JButton("-");
        jButtonMinus.addActionListener(new ButtonListener(textField, textFieldResult));
        JButton jButtonClear = new JButton("C");
        jButtonClear.addActionListener(new ButtonListener(textField, textFieldResult));
        JButton jButtonResult = new JButton("=");
        jButtonResult.addActionListener(new ButtonListener(textField, textFieldResult));

        jPanelCommands.add(jButtonPlus);
        jPanelCommands.add(jButtonMinus);
        jPanelCommands.add(jButtonClear);
        jPanelCommands.add(jButtonResult);

        jPanelScoreboard.add(textField);
        jPanelResult.add(textFieldResult);

        JButton[] jButtons = new JButton[10];

        //setLayout(new GridLayout(4, 3));

        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton(""+i);
            jButtons[i].addActionListener(new ButtonListener(textField, textFieldResult));
            jPanelNumber.add(jButtons[i]);
        }
        jPanel.add(jPanelScoreboard, BorderLayout.NORTH);
        jPanel.add(jPanelNumber,BorderLayout.AFTER_LAST_LINE);
        jPanel.add(jPanelCommands,BorderLayout.LINE_END);
        jPanel.add(jPanelResult,BorderLayout.SOUTH);
        jFrame.add(jPanel);
        jFrame.setSize(200, 300);
        jFrame.setLocation(500, 500);
        jFrame.show();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
