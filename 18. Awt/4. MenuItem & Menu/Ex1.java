import java.awt.*;
import java.awt.event.*;

public class Ex1 implements ActionListener {
    Frame f;

    Ex1() {
        f = new Frame("myframe");
        MenuBar mb = new MenuBar();

        Menu menu1 = new Menu("File");
        MenuItem m11 = new MenuItem("New");
        MenuItem m12 = new MenuItem("Open");
        MenuItem m13 = new MenuItem("Exit");

        menu1.add(m11);
        menu1.add(m12);
        menu1.add(m13);

        mb.add(menu1);

        Menu menu2 = new Menu("Edit");
        MenuItem m21 = new MenuItem("Cut");
        MenuItem m22 = new MenuItem("Copy");
        MenuItem m23 = new MenuItem("Paste");

        menu2.add(m21);
        menu2.add(m22);
        menu2.add(m23);

        mb.add(menu2);

        f.setMenuBar(mb);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);

        // registration
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String menuText = e.getActionCommand();

        if (menuText == "Exit") {
            f.dispose();
        }
        if (menuText == "Open") {
            f.setBackground(Color.red);
        }
        if (menuText.equals("New")) {
            f.setBackground(Color.yellow);
        }
    }

    public static void main(String[] args) {
        new Ex1();
    }
}