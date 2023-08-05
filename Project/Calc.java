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