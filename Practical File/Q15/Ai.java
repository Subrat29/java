import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    Frame f;
    TextField tf;
    Button[] numberButtons;
    Button[] operatorButtons;
    Button equalsButton, clearButton;

    String currentInput = "";
    double num1, num2;
    char operator;

    Calculator() {
        f = new Frame("Calculator");
        f.setLayout(new FlowLayout());

        tf = new TextField(20);
        f.add(tf);

        numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            f.add(numberButtons[i]);
        }

        operatorButtons = new Button[4];
        operatorButtons[0] = new Button("+");
        operatorButtons[1] = new Button("-");
        operatorButtons[2] = new Button("*");
        operatorButtons[3] = new Button("/");
        for (Button opButton : operatorButtons) {
            opButton.addActionListener(this);
            f.add(opButton);
        }

        equalsButton = new Button("=");
        equalsButton.addActionListener(this);
        clearButton = new Button("C");
        clearButton.addActionListener(this);

        f.add(equalsButton);
        f.add(clearButton);

        f.setSize(200, 300);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String buttonText = ae.getActionCommand();

        if (buttonText.equals("+") || buttonText.equals("-") || buttonText.equals("*") || buttonText.equals("/")) {
            num1 = Double.parseDouble(currentInput);
            operator = buttonText.charAt(0);
            currentInput = "";
        } else if (buttonText.equals("=")) {
            num2 = Double.parseDouble(currentInput);
            double result = calculate(num1, num2, operator);
            currentInput = String.valueOf(result);
        } else if (buttonText.equals("C")) {
            currentInput = "";
        } else {
            currentInput += buttonText;
        }

        tf.setText(currentInput);
    }

    private double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0)
                    return num1 / num2;
                else
                    throw new ArithmeticException("Cannot divide by zero");
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
