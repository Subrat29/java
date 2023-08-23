import java.awt.*;
import java.awt.event.*;

class Q15 implements ActionListener {
    Frame f;
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plusButton, exitButton, equalButton;
    TextField tf;

    Q15() {
        f = new Frame("MyFrame");

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
        equalButton = new Button("=");
        exitButton = new Button("Exit");

        // TextField
        tf = new TextField();
        tf.setBounds(30, 330, 150, 40);
        f.add(tf, FlowLayout.LEFT);

        f.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        f.add(b0, FlowLayout.LEFT);
        f.add(b1, FlowLayout.LEFT);
        f.add(b2, FlowLayout.LEFT);
        f.add(b3, FlowLayout.LEFT);
        f.add(b4, FlowLayout.LEFT);
        f.add(b5, FlowLayout.LEFT);
        f.add(b6, FlowLayout.LEFT);
        f.add(b7, FlowLayout.LEFT);
        f.add(b8, FlowLayout.LEFT);
        f.add(b9, FlowLayout.LEFT);
        f.add(plusButton, FlowLayout.LEFT);
        f.add(equalButton, FlowLayout.LEFT);
        f.add(exitButton, FlowLayout.LEFT);

        f.setSize(500, 500);
        f.setVisible(true);

        exitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getActionCommand();
        if (s == "Exit") {
            f.dispose();
        }
    }

    public static void main(String s[]) {
        new Q15();
    }
}