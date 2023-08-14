import javax.swing.*;
import java.awt.event.*;

public class Ex1 implements ActionListener {
    JFrame f;
    JButton b;

    Ex1() {
        f = new JFrame("myframe");
        b = new JButton("click");

        b.setBounds(50, 100, 95, 30);

        f.add(b);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println("hell0 jii");
    }

    public static void main(String[] args) {
        new Ex1();
    }
}