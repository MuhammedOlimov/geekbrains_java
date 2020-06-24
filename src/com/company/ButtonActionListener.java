package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonActionListener implements ActionListener {
    private final JTextArea textFieldOutput;
    private final JTextField textFieldInput;

    public ButtonActionListener(JTextArea textFieldOutput, JTextField textFieldInput) {
        this.textFieldOutput = textFieldOutput;
        this.textFieldInput = textFieldInput;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Нажата интер" + textField.getText());
        String current = textFieldInput.getText();
        StringBuilder sb = new StringBuilder(textFieldOutput.getText());
        sb.append(current);
        textFieldOutput.setText(sb.toString()+"\n");
        textFieldInput.setText("");

    }
}
