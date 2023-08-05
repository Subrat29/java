import java.awt.*;
import java.awt.event.*;

public class Ex1 implements ActionListener, ItemListener {
    Frame f;
    Choice c;
    Button b;
    TextField tf;

    Ex1() {

        // FRAME
        f = new Frame();
        f.setSize(500, 500);
        f.setBackground(Color.black);
        f.setLayout(null);
        f.setVisible(true);

        // BUTTON
        b = new Button("Exit");
        b.setBounds(100, 270, 75, 40);
        b.setBackground(Color.yellow);
        // add button in frame
        f.add(b);
        // button registration
        b.addActionListener(this);

        // TEXTFIELD
        Font fo = new Font("Times Roman", Font.BOLD, 35);
        tf = new TextField();
        tf.setFont(fo);
        tf.setBounds(100, 200, 200, 50);
        tf.setBackground(Color.white);
        f.add(tf);

        // CHOICE
        c = new Choice();
        c.setBackground(Color.pink);
        c.setBounds(100, 100, 200, 75);
        c.add("Pratik");
        c.add("Anurag");
        c.add("Rahul");
        c.add("Sparshi");
        c.add("Pooja");
        c.add("Select");
        c.select("Select");
        f.add(c);
        c.addItemListener(this);

    }

    //Abstract method for button
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("Exit")) {
            f.dispose();
        }
    }

    //Abstract method for textfield
    public void itemStateChanged(ItemEvent ie) {
        tf.setText(c.getSelectedItem());
    }

    public static void main(String[] args) {
        new Ex1();
    }
}