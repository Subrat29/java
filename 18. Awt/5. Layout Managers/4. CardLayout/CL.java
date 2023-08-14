import java.awt.*;
import java.awt.event.*;

class CL implements ActionListener {

    Frame f;
    CardLayout card;

    CL() {
        f = new Frame("example");

        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");

        card = new CardLayout(100,100);
        f.setLayout(card);
        // f.setLayout(new CardLayout());

        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setSize(400, 400);
        f.setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        // Flips to the next card of the specified container
        card.next(f);

        String s = ae.getActionCommand();

        if (s == "1") {
            f.setBackground(Color.red);
        }

        if (s == "2") {
            f.setBackground(Color.green);
        }

        if (s == "3")
            f.dispose();
    }

    public static void main(String s[]) {
        new CL();
    }
}