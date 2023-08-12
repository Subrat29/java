import java.awt.*;
import java.awt.event.*;

public class Calc implements ActionListener {
    Frame f;
    Button b1;

    Calc() {
        f = new Frame("MyFrame");
        b1 = new Button("click");

        b1.setBounds(30, 250, 70, 50);
        b1.setBackground(Color.red);

        // b1.setBounds(50, 100, 30, 30);
        // b2.setBounds(50, 130, 30, 30);
        // b3.setBounds(50, 160, 30, 30);
        // b4.setBounds(50, 190, 30, 30);
        // b5.setBounds(50, 220, 30, 30);

        f.add(b1);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setBackground(Color.yellow);
        f.setVisible(true);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String s[]) {
        new Calc();
    }
}