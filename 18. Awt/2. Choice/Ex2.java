import java.awt.*;
import java.awt.event.*;

public class Ex2 implements ActionListener, ItemListener {

    Frame f;
    Button b;
    TextField tf;
    Choice ch;

    Ex2() {
        f = new Frame("MyFrame");
        b = new Button("Exit");
        tf = new TextField("Mytext");
        ch = new Choice();

        b.setBounds(50, 50, 80, 40);
        f.add(b);

        tf.setBounds(50, 120, 80, 40);
        f.add(tf);

        ch.setBounds(50, 200, 80, 40);
        ch.add("Yellow");
        ch.add("Red");
        ch.add("Green");
        ch.add("Exit");
        f.add(ch);

        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        // Registration
        b.addActionListener(this);
        ch.addItemListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String str = e.getActionCommand();
        if (str.equals("Exit")) {
            f.dispose();
        }
    }

    public void itemStateChanged(ItemEvent e) {
        String choiceTextselector = ch.getSelectedItem();
        tf.setText(choiceTextselector);

        if (choiceTextselector == "Red") {
            f.setBackground(Color.red);
        }

        if (choiceTextselector == "Green") {
            f.setBackground(Color.green);
        }

        if (choiceTextselector == "Yellow") {
            f.setBackground(Color.yellow);
        }
    }

    public static void main(String s[]) {
        new Ex2();
    }

}
