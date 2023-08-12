import java.awt.*;

public class Ex1 {
    Frame f;
    Panel p1;
    Panel p2;
    Button b1;
    Button b2;

    Ex1() {
        f = new Frame("Myframe");
        p1 = new Panel();
        p2 = new Panel();

        p1.setBounds(40, 80, 100, 100);
        p1.setBackground(Color.red);
        p2.setBounds(40, 200, 100, 100);
        p2.setBackground(Color.blue);

        f.add(p1);
        f.add(p2);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String s[]) {
        new Ex1();
    }
}
