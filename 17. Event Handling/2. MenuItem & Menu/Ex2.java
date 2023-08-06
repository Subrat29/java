import java.awt.*;
import java.awt.event.*;

public class Ex2 implements ActionListener {
    Frame f;

    Ex2() {
        f = new Frame("myFrame");

        // create a MenuBar
        MenuBar mbar = new MenuBar();

        // ----------------------------------------------------------------
        // create a Menu1
        Menu menu1 = new Menu("File");

        // create MenuItems
        MenuItem mi11 = new MenuItem("New");
        MenuItem mi12 = new MenuItem("Open");
        MenuItem mi13 = new MenuItem("Exit");

        // add MenuItems in Menu
        menu1.add(mi11);
        menu1.add(mi12);
        menu1.add(mi13);

        // add Menu1 into MenuBar
        mbar.add(menu1);
        // ------------------------------------------------------------------

        // create a Menu2
        Menu menu2 = new Menu("Edit");

        // create MenuItems for Menu2
        MenuItem mi21 = new MenuItem("Cut");
        MenuItem mi22 = new MenuItem("Copy");
        MenuItem mi23 = new MenuItem("Paste");

        // add menu2 into menuBar
        mbar.add(menu2);

        // add menuitems in menu
        menu2.add(mi21);
        menu2.add(mi22);
        menu2.add(mi23);

        // ---------------------------------------------------------------------
        // create a menu inside a menu
        Menu menu3 = new Menu("Save");
        MenuItem m31 = new MenuItem("save1");
        MenuItem m32 = new MenuItem("save2");
        menu3.add(m31);
        menu3.add(m32);
        menu2.add(menu3);
        // ------------------------------------------------------------------------

        f.setMenuBar(mbar);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        // Note: Registration is important if perform some operations on menu,
        // menuItems.
        mi11.addActionListener(this);
        mi12.addActionListener(this);
        mi13.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str == "Exit") {
            f.dispose();
        } else if (str == "New") {
            f.setBackground(Color.yellow);
        } else if (str == "Open") {
            f.setBackground(Color.green);
        }
    }

    public static void main(String[] args) {
        new Ex2();
    }
}