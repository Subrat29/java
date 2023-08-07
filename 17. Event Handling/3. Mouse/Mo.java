import java.awt.event.*;
import java.awt.*;

public class Mo implements MouseListener, MouseMotionListener {

    Frame f;
    TextField tf;
    Label lb;

    Mo() {

        f = new Frame("Myframe");
        // tf = new TextField("Mytext", 20); // *********
        // lb = new Label("myLabel", 5); // *********

        tf = new TextField("Mytext");
        lb = new Label("myLabel");

        f.setSize(500, 500);
        tf.setBounds(50, 100, 50, 50);
        lb.setBounds(50, 150, 50, 40);
        // carefully give the coordinates other they overlap

        f.add(tf);
        f.add(lb);
        f.setLayout(null);
        f.setVisible(true);

        // Registration
        tf.addMouseListener(this);
        // lb.addMouseListener(this);
        f.addMouseMotionListener(this); // *********
    }

    // ****************** mouseListener******
    public void mouseClicked(MouseEvent me) {
        System.out.println("MouseClicked");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("MouseEntered");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("MouseExited");
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("MousePressed");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("MouseReleased");
    }

    // ****************** mouseMotionListener******
    public void mouseDragged(MouseEvent me) {
        System.out.println("Dragged");
    }

    public void mouseMoved(MouseEvent me) {
        System.out.println("MouseMoved");
    }

    public static void main(String[] args) {
        new Mo();
    }
}
