package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    private TextField jTextField;
    private TextField jTextFieldResult;
    final String  commandClear = "C";
    final String commandResult = "=";


    public ButtonListener(TextField jTextField, TextField jTextFieldResult) {
        this.jTextField = jTextField;
        this.jTextFieldResult = jTextFieldResult;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String textFromBoard = jTextField.getText();
        String textOfButton = jButton.getText();
        if (textOfButton.equals(commandClear)){
            jTextField.setText("");
        } else if (textOfButton.equals(commandResult)){
            jTextFieldResult.setText(getResult(textFromBoard));
        } else {
            jTextField.setText(textFromBoard + jButton.getText());
        }

    }
    public double calculate (String board){
        double result = 0.00;

        return result;
    }
     public String getResult (String scoreBoard){
        double result = 0.00;
        double fistNumber = 0.00;
        double secondNumber = 0.00;
        String operand = "";
        String [] subString = new String[0];
        String operandPlus = "+";
        String operandMinus = "-";
        if (scoreBoard.indexOf(operandPlus)>0){
            subString = scoreBoard.split("\\+");
            operand = operandPlus;
        } else if (scoreBoard.indexOf(operandMinus)>0){
            subString = scoreBoard.split(operandMinus);
            operand = operandMinus;
        }
        fistNumber = Double.parseDouble(subString[0]);
        secondNumber = Double.parseDouble(subString[1]);
        if (operand.equals("+")){
            result = fistNumber + secondNumber;
        } else if (operand.equals("-")){
            result = fistNumber - secondNumber;
        } else {
            System.out.println("error");
        }
        return Double.toString(result);
     }
}
