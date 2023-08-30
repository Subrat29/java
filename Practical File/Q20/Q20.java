import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Q20 implements MouseListener, MouseMotionListener, MouseWheelListener {

    JFrame frame;
    JTextField textfield;
    JLabel label;

    Q20() {

        // Font
        Font fo = new Font("Roman", Font.BOLD, 30);

        // Frame
        frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Textfield
        textfield = new JTextField("Write here");
        textfield.setBounds(50, 50, 200, 80);

        // Label
        label = new JLabel("Label");
        label.setBounds(50, 150, 250, 80);
        label.setFont(fo);

        frame.add(textfield);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);

        // Registration
        textfield.addMouseListener(this);
        textfield.addMouseWheelListener(this);
        textfield.addMouseMotionListener(this);
        frame.addMouseMotionListener(this);
        frame.addMouseWheelListener(this);
        frame.addMouseListener(this);
    }

    // ****** mouseListener******
    public void mouseClicked(MouseEvent me) {
        System.out.println("MouseClicked");
        label.setText("MouseClicked");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("MouseEntered");
        label.setText("MouseEntered");

        textfield.setBackground(Color.yellow);
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("MouseExited");
        label.setText("MouseExited");

        textfield.setBackground(Color.cyan);
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("MousePressed");
        label.setText("MousePressed");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("MouseReleased");
        label.setText("MouseReleased");
    }

    // ******mouseMotionListener******
    public void mouseDragged(MouseEvent me) {
        System.out.println("Dragged");
        label.setText("Dragged");
    }

    public void mouseMoved(MouseEvent me) {
        System.out.println("MouseMoved");
        label.setText("MouseMoved");
    }

    // ****** MouseWheelListener******
    public void mouseWheelMoved(MouseWheelEvent e) {
        System.out.println("Mousewheel");
        label.setText("Mousewheel");

        if (e.getWheelRotation() < 0) {
            frame.getContentPane().setBackground(Color.red);
        } else {
            frame.getContentPane().setBackground(Color.green);
        }
    }

    public static void main(String[] args) {
        new Q20();
    }

}
