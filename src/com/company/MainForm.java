package com.company;

import javax.swing.*;
import java.awt.*;

public class MainForm extends JFrame {

    public MainForm()  {
        setTitle("Messenger");
        setBounds(500, 300, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       // Container mainContainer = new Panel();
//        mainContainer.setLayout(new BorderLayout());
//        mainContainer.setBackground(new Color(255,255,255));
//        this.getRootPane().setBorder(BorderFactory.createMatteBorder(2,2,2,2, Color.BLACK));

        JPanel messagePanel = new JPanel();
        messagePanel.setLayout(new BorderLayout());
        messagePanel.setBackground(new Color(255, 255, 255));

        JTextArea textFieldOutput = new JTextArea(200,42);
        textFieldOutput.setEditable(false);
        textFieldOutput.setLineWrap(true);
        //textFieldOutput.setText("");
        JScrollPane scrollPane = new JScrollPane(textFieldOutput);
        //scrollPane.setBounds(0,0,450, 200);
        messagePanel.add(scrollPane);
        //messagePanel.add(textFieldOutput);

        add(messagePanel, BorderLayout.CENTER);


        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(2));
        inputPanel.setBackground(new Color(0, 153, 153));
        JTextField textFieldInput = new JTextField(36);
        textFieldInput.setEditable(true);
        textFieldInput.setFocusable(true);
        textFieldInput.addKeyListener(new ButtonKeyListener(textFieldOutput, textFieldInput));
        inputPanel.add(textFieldInput);
        JButton jButtonInput = new JButton("Send");
        jButtonInput.addActionListener(new ButtonActionListener(textFieldOutput, textFieldInput));
        inputPanel.add(jButtonInput);
        add(inputPanel, BorderLayout.SOUTH);


        setVisible(true);
    }
}
