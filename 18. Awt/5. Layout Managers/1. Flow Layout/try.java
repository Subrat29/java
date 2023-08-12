import java.awt.*;
import java.awt.event.*;
// import java.awt.FlowLayout;
import java.awt.Container;

//Note: if u implement a interface then u have to mark the class public
public class FlowLayout implements ActionListener {
    Frame f;

    FlowLayout() {
        // f = new Frame("mf");
        // Button b1 = new Button("Exit");
        // Button b2 = new Button("2");
        // Button b3 = new Button("3");
        // Button b4 = new Button("4");
        // Button b5 = new Button("5");

        // // f.setLayout(null);
        // // b1.setBounds(50, 100, 30, 30);
        // // b2.setBounds(50, 130, 30, 30);
        // // b3.setBounds(50, 160, 30, 30);
        // // b4.setBounds(50, 190, 30, 30);
        // // b5.setBounds(50, 220, 30, 30);

        // f.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        // f.add(b1, FlowLayout.LEFT);
        // f.add(b2, FlowLayout.LEFT);
        // f.add(b3, FlowLayout.CENTER);
        // f.add(b4, FlowLayout.LEFT);
        // f.add(b5, FlowLayout.LEFT);

        // f.setSize(500, 500);
        // f.setVisible(true);
        // // f.add(b1);
        // // f.add(b2);
        // // f.add(b3);
        // // f.add(b4);
        // // f.add(b5);

        // // Registration
        // b1.addActionListener(this);

        f = new Frame("example");
        Button be = new Button("Click");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        f.add(b1, FlowLayout.LEFT);
        f.add(b2, FlowLayout.LEFT);
        f.add(be, FlowLayout.CENTER);
        f.add(b3, FlowLayout.LEFT);
        f.add(b4, FlowLayout.LEFT);
        f.setSize(500, 500);
        f.setVisible(true);
        be.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s == "Exit") {
            f.dispose();
        }
    }

    public static void main(String[] args) {
        new FlowLayout();
    }
}
