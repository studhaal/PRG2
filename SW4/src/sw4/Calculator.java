/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author studhaal
 */
public class Calculator extends Frame implements WindowListener, ActionListener {

    private final int width = 250;
    private final int height = 210;
    Button btnZero = new Button("0");
    Button btnOne = new Button("1");
    Button btnTwo = new Button("2");
    Button btnThree = new Button("3");
    Button btnFour = new Button("4");
    Button btnFive = new Button("5");
    Button btnSix = new Button("6");
    Button btnSeven = new Button("7");
    Button btnEight = new Button("8");
    Button btnNine = new Button("9");
    Button btnSign = new Button("S");
    Button btnClear = new Button("C");
    Button btnEquals = new Button("=");
    Button btnDivide = new Button("/");
    Button btnMultiply = new Button("*");
    Button btnMinus = new Button("-");
    Button btnPlus = new Button("+");
    TextField txtResult = new TextField("0");
    Panel myPanel = new Panel();
    private int operand1;
    private int operand2;
    private int result;
    private int operator; // 0-> Operator Unbekannt, 1-> +, 2-> -, 3->*, 4->/
    private char ch;

    public Calculator() {
        super("Calculator");
        setSize(width, height);
        setResizable(true);
        setLayout(new BorderLayout());
        txtResult.setEditable(false);
        txtResult.setBackground(Color.WHITE);
        add(txtResult, BorderLayout.NORTH);
        myPanel.setLayout(new GridLayout(5, 4));
        myPanel.add(btnSeven);
        myPanel.add(btnEight);
        myPanel.add(btnNine);
        myPanel.add(btnDivide);
        myPanel.add(btnFour);
        myPanel.add(btnFive);
        myPanel.add(btnSix);
        myPanel.add(btnMultiply);
        myPanel.add(btnOne);
        myPanel.add(btnTwo);
        myPanel.add(btnThree);
        myPanel.add(btnMinus);
        myPanel.add(btnZero);
        myPanel.add(btnSign);
        myPanel.add(btnEquals);
        myPanel.add(btnPlus);
        myPanel.add(btnClear);
        add(myPanel, BorderLayout.CENTER);
        addWindowListener(this);
        btnOne.addActionListener(this);
        btnTwo.addActionListener(this);
        btnThree.addActionListener(this);
        btnFour.addActionListener(this);
        btnFive.addActionListener(this);
        btnSix.addActionListener(this);
        btnSeven.addActionListener(this);
        btnEight.addActionListener(this);
        btnNine.addActionListener(this);
        btnZero.addActionListener(this);
        btnDivide.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnMinus.addActionListener(this);
        btnPlus.addActionListener(this);
        btnSign.addActionListener(this);
        btnClear.addActionListener(this);
        btnEquals.addActionListener(this);
        setVisible(true);
    }

    public void calculateResult() {
        switch (operator) {
            case 0:
                break;
            case 1:
                result = operand1 + operand2;
                txtResult.setText(String.valueOf(result));
                operand1 = result;
                operand2 = 0;
                break;
            case 2:
                result = operand1 - operand2;
                txtResult.setText(String.valueOf(result));
                operand1 = result;
                operand2 = 0;
                break;
            case 3:
                result = operand1 * operand2;
                txtResult.setText(String.valueOf(result));
                operand1 = result;
                operand2 = 0;
                break;
            case 4:
                if (operand2 != 0) {
                    result = operand1 / operand2;
                    txtResult.setText(String.valueOf(result));
                    operand1 = result;
                    operand2 = 0;
                } else {
                    txtResult.setText("Error: Division durch Null");
                }
                break;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ch = (e.getActionCommand().charAt(0));
        switch (ch) {
            case 'C':
                operand1 = 0;
                operand2 = 0;
                operator = 0;
                result = 0;
                txtResult.setText("0");
                break;
            case '/':
                calculateResult();
                operator = 4;
                break;
            case '*':
                calculateResult();
                operator = 3;
                break;
            case '+':
                calculateResult();
                operator = 1;
                break;
            case '-':
                calculateResult();
                operator = 2;
                break;
            case '=':
                calculateResult();
                operator = 0;
                break;
            default:
                if (operator == 0) {
                    operand1 = (operand1 * 10) + ch - '0';
                    txtResult.setText(String.valueOf(operand1));
                } else {
                    operand2 = (operand2 * 10) + ch - '0';
                    txtResult.setText(String.valueOf(operand2));
                }
                break;
        }
    }
}
