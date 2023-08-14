import javax.swing.*;

public class Ex2 extends JFrame {
    JFrame f;

    Ex2() {
        JButton b = new JButton("click");

        b.setBounds(130, 100, 100, 40);
        
        add(b);
        setSize(400, 450);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex2();
    }
}