package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    CalculatorView calView;

    CalculatorController(CalculatorView calView) {
        this.calView = calView;
        calView.allListeners(new ActionButton());
    }

    class ActionButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent don) {
            if(don.getSource() == calView.addButton) {
                int num1 = Integer.parseInt(calView.num1TF.getText());
                int num2 = Integer.parseInt(calView.num2TF.getText());
                int sum = CalculatorModel.addNumbers(num1, num2);
                calView.boxResult.setText("" + sum);
            }
            if(don.getSource() == calView.minusButton) {
                int num1 = Integer.parseInt(calView.num1TF.getText());
                int num2 = Integer.parseInt(calView.num2TF.getText());
                int result = CalculatorModel.subtractNumbers(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(don.getSource() == calView.multiplyButton) {
                int num1 = Integer.parseInt(calView.num1TF.getText());
                int num2 = Integer.parseInt(calView.num2TF.getText());
                int result = CalculatorModel.multiplyNumbers(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(don.getSource() == calView.divideButton) {
                int num1 = Integer.parseInt(calView.num1TF.getText());
                int num2 = Integer.parseInt(calView.num2TF.getText());
                int result = CalculatorModel.divideNumbers(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(don.getSource() == calView.modulusButton) {
                int num1 = Integer.parseInt(calView.num1TF.getText());
                int num2 = Integer.parseInt(calView.num2TF.getText());
                int result = CalculatorModel.modulusNumbers(num1, num2);
                calView.boxResult.setText("" + result);
            }
            if(don.getSource() == calView.clearButton) {
                calView.num1TF.setText("");
                calView.num2TF.setText("");
                calView.boxResult.setText("");
            }
        }

    }
}