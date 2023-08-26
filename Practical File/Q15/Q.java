import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q{
// class Q implements ActionListener, ItemListener {
    JFrame f;
    Font fo;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JButton plusButton, equalButton, minusButton, multiButton, divideButton, exitButton;
    JTextField tf;

    int n1 = 0;
    String operator = "";
    boolean clear = false;

    Q() {

        // Font
        fo = new Font("Times Roman", Font.BOLD, 35);

        // Frame
        f = new JFrame("MyFrame");
        // f.setBackground(Color.darkGray);
        // f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

        // Buttons
        b0 = new JButton("0");
        b0.setBounds(50, 50, 40, 20);
        // b1 = new JButton("1");
        // b2 = new JButton("2");
        // b3 = new JButton("3");
        // b4 = new JButton("4");
        // b5 = new JButton("5");
        // b6 = new JButton("6");
        // b7 = new JButton("7");
        // b8 = new JButton("8");
        // b9 = new JButton("9");
        // plusButton = new JButton("+");
        // minusButton = new JButton("-");
        // multiButton = new JButton("*");
        // divideButton = new JButton("/");
        // equalButton = new JButton("=");
        // exitButton = new JButton("Exit");

        // Adjust Butoon width and height as needed
        // Dimension buttonSize = new Dimension(40, 40);
        // b0.setPreferredSize(buttonSize);
        // b1.setPreferredSize(buttonSize);
        // b2.setPreferredSize(buttonSize);
        // b3.setPreferredSize(buttonSize);
        // b4.setPreferredSize(buttonSize);
        // b5.setPreferredSize(buttonSize);
        // b6.setPreferredSize(buttonSize);
        // b7.setPreferredSize(buttonSize);
        // b8.setPreferredSize(buttonSize);
        // b9.setPreferredSize(buttonSize);
        // plusButton.setPreferredSize(buttonSize);
        // minusButton.setPreferredSize(buttonSize);
        // multiButton.setPreferredSize(buttonSize);
        // divideButton.setPreferredSize(buttonSize);
        // equalButton.setPreferredSize(buttonSize);
        // exitButton.setPreferredSize(new Dimension(80, 40));

        // Button font
        // b0.setFont(fo);
        // b1.setFont(fo);
        // b2.setFont(fo);
        // b3.setFont(fo);
        // b4.setFont(fo);
        // b5.setFont(fo);
        // b6.setFont(fo);
        // b7.setFont(fo);
        // b8.setFont(fo);
        // b9.setFont(fo);
        // plusButton.setFont(fo);
        // minusButton.setFont(fo);
        // multiButton.setFont(fo);
        // divideButton.setFont(fo);
        // equalButton.setFont(fo);
        // exitButton.setFont(fo);

        // // TextField
        // tf = new JTextField();
        // tf.setPreferredSize(new Dimension(400, 40));
        // tf.setFont(fo);

        // add components in Frame
        // f.add(tf);
        f.add(b0);
        // f.add(b1);
        // f.add(b2);
        // f.add(b3);
        // f.add(b4);
        // f.add(b5);
        // f.add(b6);
        // f.add(b7);
        // f.add(b8);
        // f.add(b9);
        // f.add(plusButton);
        // f.add(minusButton);
        // f.add(multiButton);
        // f.add(divideButton);
        // f.add(equalButton);
        // f.add(exitButton);

        // // Registration of components
        // b0.addActionListener(this);
        // b1.addActionListener(this);
        // b2.addActionListener(this);
        // b3.addActionListener(this);
        // b4.addActionListener(this);
        // b5.addActionListener(this);
        // b6.addActionListener(this);
        // b7.addActionListener(this);
        // b8.addActionListener(this);
        // b9.addActionListener(this);
        // plusButton.addActionListener(this);
        // minusButton.addActionListener(this);
        // multiButton.addActionListener(this);
        // divideButton.addActionListener(this);
        // equalButton.addActionListener(this);
        // exitButton.addActionListener(this);
    }

    // // Handle Button Events
    // public void actionPerformed(ActionEvent ae) {

    //     String s = ae.getActionCommand();

    //     // Exit button
    //     if (s.equals("Exit")) {
    //         f.dispose();
    //     }

    //     // Handle digit buttons
    //     else if (s.matches("[0-9]")) {

    //         if (clear == true) {
    //             tf.setText("");
    //             clear = false;
    //         }
    //         tf.setText(tf.getText() + s);
    //     }

    //     // Handle '+' buttons
    //     else if (s.equals("+")) {

    //         if (!tf.getText().isEmpty()) {
    //             n1 = Integer.parseInt(tf.getText());
    //             tf.setText("");
    //             operator = "+";
    //         }
    //     }

    //     // Handle '-' buttons
    //     else if (s.equals("-")) {

    //         if (!tf.getText().isEmpty()) {
    //             n1 = Integer.parseInt(tf.getText());
    //             tf.setText("");
    //             operator = "-";
    //         }
    //     }

    //     // Handle '*' buttons
    //     else if (s.equals("*")) {

    //         if (!tf.getText().isEmpty()) {
    //             n1 = Integer.parseInt(tf.getText());
    //             tf.setText("");
    //             operator = "*";
    //         }
    //     }

    //     // Handle '/' buttons
    //     else if (s.equals("/")) {

    //         if (!tf.getText().isEmpty()) {
    //             n1 = Integer.parseInt(tf.getText());
    //             tf.setText("");
    //             operator = "/";
    //         }
    //     }

    //     // Handle '=' buttons
    //     else if (s.equals("=")) {

    //         if (!tf.getText().isEmpty()) {
    //             int n2 = Integer.parseInt(tf.getText());

    //             switch (operator) {
    //                 case "+":
    //                     tf.setText(Integer.toString(n1 + n2));
    //                     clear = true;
    //                     break;

    //                 case "-":
    //                     tf.setText(Integer.toString(n1 - n2));
    //                     clear = true;
    //                     break;

    //                 case "*":
    //                     tf.setText(Integer.toString(n1 * n2));
    //                     clear = true;
    //                     break;

    //                 case "/":
    //                     tf.setText(Integer.toString(n1 / n2));
    //                     clear = true;
    //                     break;
    //             }
    //         }
    //     }
    // }

    // // Handle Textfield Events
    // public void itemStateChanged(ItemEvent i) {
    // }

    public static void main(String s[]) {
        new Q();
    }
}