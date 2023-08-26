import java.awt.*;
import java.awt.event.*;

class Q15 implements ActionListener, ItemListener {
    Frame f;
    Font fo;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Button plusButton, equalButton, minusButton, multiButton, divideButton, exitButton;
    TextField tf;

    double n1 = 0;
    String operator = "";
    boolean clear = false;

    Q15() {

        // Font
        fo = new Font("Times Roman", Font.BOLD, 35);

        // Frame
        f = new Frame("MyFrame");
        f.setBackground(Color.black);
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        f.setSize(500, 500);
        f.setVisible(true);

        // Buttons
        b0 = new Button("0");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        plusButton = new Button("+");
        minusButton = new Button("-");
        multiButton = new Button("*");
        divideButton = new Button("/");
        equalButton = new Button("=");
        exitButton = new Button("Exit");

        // Adjust Butoon width and height as needed
        Dimension buttonSize = new Dimension(40, 40);
        b0.setPreferredSize(buttonSize);
        b1.setPreferredSize(buttonSize);
        b2.setPreferredSize(buttonSize);
        b3.setPreferredSize(buttonSize);
        b4.setPreferredSize(buttonSize);
        b5.setPreferredSize(buttonSize);
        b6.setPreferredSize(buttonSize);
        b7.setPreferredSize(buttonSize);
        b8.setPreferredSize(buttonSize);
        b9.setPreferredSize(buttonSize);
        plusButton.setPreferredSize(buttonSize);
        minusButton.setPreferredSize(buttonSize);
        multiButton.setPreferredSize(buttonSize);
        divideButton.setPreferredSize(buttonSize);
        equalButton.setPreferredSize(buttonSize);
        exitButton.setPreferredSize(new Dimension(80, 40));

        // Button font
        b0.setFont(fo);
        b1.setFont(fo);
        b2.setFont(fo);
        b3.setFont(fo);
        b4.setFont(fo);
        b5.setFont(fo);
        b6.setFont(fo);
        b7.setFont(fo);
        b8.setFont(fo);
        b9.setFont(fo);
        plusButton.setFont(fo);
        minusButton.setFont(fo);
        multiButton.setFont(fo);
        divideButton.setFont(fo);
        equalButton.setFont(fo);
        exitButton.setFont(fo);

        // TextField
        tf = new TextField();
        tf.setPreferredSize(new Dimension(400, 40));
        tf.setFont(fo);

        // add components in Frame
        f.add(tf);
        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(plusButton);
        f.add(minusButton);
        f.add(multiButton);
        f.add(divideButton);
        f.add(equalButton);
        f.add(exitButton);

        // Registration of components
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        plusButton.addActionListener(this);
        minusButton.addActionListener(this);
        multiButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    // Handle Button Events
    public void actionPerformed(ActionEvent ae) {

        String s = ae.getActionCommand();

        // Exit button
        if (s.equals("Exit")) {
            f.dispose();
        }

        // Handle digit buttons
        else if (s.matches("[0-9]")) {

            if (clear == true) {
                tf.setText("");
                clear = false;
            }
            tf.setText(tf.getText() + s);
        }

        // Handle '+' buttons
        else if (s.equals("+")) {

            if (!tf.getText().isEmpty()) {
                n1 = Double.parseDouble(tf.getText());
                tf.setText("");
                operator = "+";
            }
        }

        // Handle '-' buttons
        else if (s.equals("-")) {

            if (!tf.getText().isEmpty()) {
                n1 = Double.parseDouble(tf.getText());
                tf.setText("");
                operator = "-";
            }
        }

        // Handle '*' buttons
        else if (s.equals("*")) {

            if (!tf.getText().isEmpty()) {
                n1 = Double.parseDouble(tf.getText());
                tf.setText("");
                operator = "*";
            }
        }

        // Handle '/' buttons
        else if (s.equals("/")) {

            if (!tf.getText().isEmpty()) {
                n1 = Double.parseDouble(tf.getText());
                tf.setText("");
                operator = "/";
            }
        }

        // Handle '=' buttons
        else if (s.equals("=")) {

            if (!tf.getText().isEmpty()) {
                double n2 = Double.parseDouble(tf.getText());

                switch (operator) {
                    case "+":
                        tf.setText(Double.toString(n1 + n2));
                        clear = true;
                        break;

                    case "-":
                        tf.setText(Double.toString(n1 - n2));
                        clear = true;
                        break;

                    case "*":
                        tf.setText(Double.toString(n1 * n2));
                        clear = true;
                        break;

                    case "/":
                        tf.setText(Double.toString(n1 / n2));
                        clear = true;
                        break;
                }
            }
        }
    }

    // Handle Textfield Events
    public void itemStateChanged(ItemEvent i) {
    }

    public static void main(String s[]) {
        new Q15();
    }
}