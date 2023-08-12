import java.awt.*;
import java.awt.event.*;
// import java.awt.FlowLayout;

public class AwtLFlow implements ActionListener {
    Frame f;

    AwtLFlow() {
        f = new Frame("example");
        Button be = new Button("Click");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
        f.add(b1, FlowLayout.LEFT);
        f.add(b2, FlowLayout.LEFT);
        f.add(be, FlowLayout.CENTER);
        f.add(b3, FlowLayout.LEFT);
        f.add(b4, FlowLayout.LEFT);
        f.setSize(500, 500);
        f.setVisible(true);
        be.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        if (cmd.equals("Click"))
            f.dispose();
    }

    public static void main(String s[]) {
        AwtLFlow ob = new AwtLFlow();
    }
}