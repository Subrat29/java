import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q16 implements KeyListener {
    JFrame f;
    JTextField tf;
    JLabel lb;
    Font fo;

    Q16() {

        // Frame
        f = new JFrame();
        f.setSize(500, 500);

        // Font
        fo = new Font("Times Roman", Font.BOLD, 20);

        // TextField
        tf = new JTextField("");
        tf.setBounds(50, 50, 350, 70);
        tf.setFont(fo);

        // Label
        lb = new JLabel("label");
        lb.setBounds(50, 150, 300, 50);
        lb.setForeground(Color.red);
        lb.setFont(fo);

        // add components
        f.add(tf);
        f.add(lb);
        f.setLayout(null);
        f.setVisible(true);

        // Registration
        tf.addKeyListener(this);
        lb.addKeyListener(this);
    }

    public void keyPressed(KeyEvent k) {
    }

    public void keyReleased(KeyEvent k) {
    }

    public void keyTyped(KeyEvent k) {
        String txt = tf.getText();
        lb.setText(txt);

        if (txt.toLowerCase().contains("exit")) {
            f.dispose();
        }

    }

    public static void main(String s[]) {
        new Q16();
    }
};
