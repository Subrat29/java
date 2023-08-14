import java.awt.*;
import java.awt.event.*;

class BL implements ActionListener {
    Frame f;

    BL() {
        f = new Frame("example");

        Button be = new Button("Click");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");

        // NOTE: In the above code, I removed the line f.setLayout(new BorderLayout(150,
        // 150)); as it was setting a fixed gap between components, which might have
        // caused the buttons to be invisible due to insufficient space. Instead, I
        // reverted to using the default BorderLayout where components are arranged
        // without explicit gaps.

        // f.setLayout(new BorderLayout(150, 150));
        f.setLayout(new BorderLayout());

        f.add(b1, BorderLayout.EAST);
        f.add(b2, BorderLayout.WEST);
        f.add(b3, BorderLayout.NORTH);
        f.add(b4, BorderLayout.SOUTH);
        f.add(be, BorderLayout.CENTER);

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
        BL ob = new BL();
    }
}