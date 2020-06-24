package com.company;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ButtonKeyListener implements KeyListener {
    private final JTextArea textFieldOutput;
    private final JTextField textFieldInput;
    public ButtonKeyListener(JTextArea textFieldOutput, JTextField textFieldInput) {
        this.textFieldOutput = textFieldOutput;
        this.textFieldInput = textFieldInput;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyChar()) {
            case KeyEvent.VK_ENTER: {
                //System.out.println("Нажата интер" + textField.getText());
                String current = textFieldInput.getText();
                StringBuilder sb = new StringBuilder(textFieldOutput.getText());
                sb.append(current);
                textFieldOutput.setText(sb.toString()+"\n");
                textFieldInput.setText("");
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
