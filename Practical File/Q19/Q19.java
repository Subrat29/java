import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q19 implements KeyListener {

    JFrame frame;
    JTextField textfield;
    JLabel label;

    Q19() {

        // Font
        Font fnt = new Font("Roman", Font.BOLD, 20);

        // Frame
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Textfield
        textfield = new JTextField("Write here");
        textfield.setBounds(50, 50, 200, 80);
        textfield.setFont(fnt);

        // Label
        label = new JLabel("Label");
        label.setBounds(50, 150, 80, 60);
        label.setFont(fnt);

        frame.add(textfield);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);

        // Registration
        textfield.addKeyListener(this);
        label.addKeyListener(this);
    }

    public void keyPressed(KeyEvent k) {
        System.out.println("keypressed");

        int v = k.getKeyCode();

        if (v == k.VK_I) {
            frame.getContentPane().setBackground(Color.red);

        }

        if (v == k.VK_A) {

            frame.getContentPane().setBackground(Color.orange);
        }

        if (v == k.VK_D) {
            // frame.setBackground(Color.pink);
            frame.getContentPane().setBackground(Color.green);
        }
    }

    public void keyReleased(KeyEvent k) {
        System.out.println("keyReleased");
    }

    public void keyTyped(KeyEvent k) {
        System.out.println("keytyped");

        if (textfield.getText().equals("exit")) {
            frame.dispose();
        }
    }

    public static void main(String[] args) {
        new Q19();
    }

}
