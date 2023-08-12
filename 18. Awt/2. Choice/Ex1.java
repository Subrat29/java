import java.awt.*;

public class Ex1 {
    Frame f;
    Choice c;

    Ex1(){
        f = new Frame();
        c = new Choice();

        c.setBounds(100,100,75,75);
        c.add("Rahu");
        c.add("GUU");
        c.add("KK");
        c.add("ANku");
        c.add("JUJU");
        f.add(c);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Ex1();
    }
}
