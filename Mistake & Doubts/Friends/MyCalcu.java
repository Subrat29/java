import java.awt.*;
import java.awt.event.*;

public class MyCalcu implements ActionListener {
    Frame f;
    TextField tf;
    Button b1, b2, b3, b4, b5, b6;
    Font fnt;
    Button clr;

    MyCalcu() {
        f = new Frame("Calculater");
        // tf = new TextField(60);
        tf = new TextField("CHullad Prabaht");
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");

        tf.setBounds(50, 50, 250, 50);

        // b1.setBounds(50, 340, 50, 50);
        // b2.setBounds(150, 340, 50, 50);
        // b3.setBounds(200, 340, 50, 50);
        // b4.setBounds(250, 270, 50, 50);
        // b5.setBounds(300, 270, 50, 50);
        // b6.setBounds(50,90,330,300);

        b1.setBounds(50, 100, 30, 30);
        b2.setBounds(50, 130, 30, 30);
        b3.setBounds(50, 160, 30, 30);
        b4.setBounds(50, 190, 30, 30);
        b5.setBounds(50, 220, 30, 30);
        b6.setBounds(80, 100, 30, 30);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);


        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(tf);

        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("close"))
            f.dispose();

    }

    public static void main(String s[]) {
        MyCalcu C = new MyCalcu();
    }
}