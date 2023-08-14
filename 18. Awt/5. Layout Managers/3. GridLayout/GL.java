import java.awt.*;
import java.awt.event.*;

class GL implements ActionListener {
    Frame f;

    GL() {
        f = new Frame("example");

        Button be = new Button("Click");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");

        // Both are working
        // f.setLayout(new GridLayout());
        // f.setLayout(new GridLayout(3, 2));
        f.setLayout(new GridLayout(3, 2, 20, 20));

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(be);

        f.setSize(500, 500);
        f.setVisible(true);
        be.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (cmd.equals("Click"))
            f.dispose();
    }

    public static void main(String s[]) {
        new GL();
    }
}