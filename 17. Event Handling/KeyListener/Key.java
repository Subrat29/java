import java.awt.event.*;
import java.awt.*;

class Key implements KeyListener {

    Label lb;
    String str = "";
    Frame f;
    TextField tf;

    Key() {

        Font fnt = new Font("Roman", Font.BOLD, 20);
        f = new Frame("myframe");
        lb = new Label("This is label");
        tf = new TextField("This is Text Field");

        tf.setFont(fnt);
        tf.setBounds(100, 100, 300, 50);
        lb.setBounds(100, 250, 300, 50);
        f.add(lb);
        f.add(tf);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        // registration
        tf.addKeyListener(this);
        lb.addKeyListener(this);
    }

    // KeyListener abstract function
    public void keyPressed(KeyEvent ke) {
        System.out.println("keyPressed");

        int v = ke.getKeyCode();

        // DOUBT:
        // this code listens for the 'A' and 'I' keys to be pressed and changes the
        // background color of a graphical component to green or red, respectively.

        if (v == ke.VK_A) {
            f.setBackground(Color.green);
        }

        if (v == ke.VK_I) {
            f.setBackground(Color.red);
        }

        if (v == ke.VK_Q) {
            f.setBackground(Color.pink);
        }
    }

    public void keyReleased(KeyEvent ke) {
        System.out.println("keyReleased");
    }

    public void keyTyped(KeyEvent ke) {
        System.out.println("keyTyped");

        char ch = ke.getKeyChar();
        str = str + ch;
        lb.setText(str);

        if (ch == ' ') {
            str = "";
        }

        // the comparison using == for strings might not work as expected because it
        // checks for reference equality, not content equality.
        // if (lb.getText() == "exit") {
        // f.dispose();

        if (lb.getText().equals("exit")) {
            f.dispose();
        }
    }

    public static void main(String[] args) {
        new Key();
    }
}