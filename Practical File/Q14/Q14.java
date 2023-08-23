import java.awt.*;
import java.awt.event.*;

class Q14 implements ActionListener {
    Frame f;
    Button b1, b2, b3, b4;

    Q14() {
        f = new Frame("myframe");

        b1 = new Button("Blue");
        b1.setBounds(50, 50, 50, 50);

        b2 = new Button("Red");
        b2.setBounds(50, 150, 50, 50);

        b3 = new Button("Green");
        b3.setBounds(50, 250, 50, 50);

        b4 = new Button("Exit");
        b4.setBounds(50, 350, 50, 50);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s == "Blue") {
            f.setBackground(Color.blue);
        }

        else if (s == "Red") {
            f.setBackground(Color.red);
        }

        else if (s == "Green") {
            f.setBackground(Color.green);
        }

        else if (s == "Exit") {
            f.dispose();
        }
    }

    public static void main(String[] args) {
        new Q14();
    }
}
