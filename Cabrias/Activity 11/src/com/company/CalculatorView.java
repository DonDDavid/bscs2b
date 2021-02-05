package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {

    JButton addButton;
    JButton minusButton;
    JButton multiplyButton;
    JButton divideButton;
    JButton modulusButton;
    JButton clearButton;
    JTextField num1TF;
    JTextField num2TF;
    JLabel result;
    JLabel firstNum;
    JLabel secondNum;
    JTextField boxResult;

    public CalculatorView() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        addButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        modulusButton = new JButton("%");
        clearButton = new JButton("CLEAR");
        num1TF = new JTextField(5);
        num2TF = new JTextField(5);
        firstNum = new JLabel("First Number     ");
        secondNum = new JLabel("Second Number       ");
        result = new JLabel("Result     ");
        boxResult = new JTextField();

        panel.setBorder(BorderFactory.createEmptyBorder(40,50,40,50));
        panel.setLayout(new GridLayout(6,2));
        panel.add(firstNum);
        panel.add(num1TF);
        panel.add(secondNum);
        panel.add(num2TF);
        panel.add(result);
        panel.add(boxResult);
        panel.add(addButton);
        panel.add(minusButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(modulusButton);
        panel.add(clearButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.pack();
        frame.setVisible(true);
    }

    public void allListeners(ActionListener don) {
        addButton.addActionListener(don);
        minusButton.addActionListener(don);
        multiplyButton.addActionListener(don);
        divideButton.addActionListener(don);
        modulusButton.addActionListener(don);
        clearButton.addActionListener(don);
    }
}
