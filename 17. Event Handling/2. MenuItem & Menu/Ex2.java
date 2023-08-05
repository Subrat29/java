import java.awt.*;
import java.awt.event.*;

public class Ex2 implements ActionListener{
    Frame f;

    Ex2(){
        f = new Frame("myFrame");
        
        //create a MenuBar
        MenuBar mbar = new MenuBar();


        //create a Menu1
        Menu menu1 = new Menu("File");

        //create MenuItems
        MenuItem mi11 = new MenuItem("New");
        MenuItem mi12 = new MenuItem("Open");
        MenuItem mi13 = new MenuItem("Exit");

        //add MenuItems in Menu
        menu1.add(mi1);
        menu1.add(mi2);
        menu1.add(mi3);

        //add Menu1 into MenuBar
        mbar.add(menu1);



        // //create a Menu2
        // Menu menu2 = new Menu("Edit");

        // //create MenuItems for Menu2
        // MenuItem mi21 = new MenuItem("Cut");
        // MenuItem mi22 = new MenuItem("Copy");
        // MenuItem mi23 = new MenuItem("Paste");  
        


        f.setMenuBar(mbar);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);

        




    }
}
