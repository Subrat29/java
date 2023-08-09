import java.awt.*;
import java.awt.event.*;

public class Cbox implements ItemListener {
    Frame f;
    Checkbox c1, c2, c3;

    Cbox() {
        f = new Frame("myframe");

        CheckboxGroup cbg = new CheckboxGroup();
        c1 = new Checkbox("Red", cbg, true);
        c2 = new Checkbox("Blue", cbg, false);
        c3 = new Checkbox("Exit", cbg, false);

        c1.setBounds(100, 30, 100, 30);
        c2.setBounds(100, 100, 100, 30);
        c3.setBounds(100, 170, 100, 30);

        // registration
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        if(){
            f.setBackground(Color.RED);
        }

        if(){
            f.setBackground(Color.BLUE);
        }

        
    }

    public static void main(String[] args) {
        new Cbox();
    }
}
