import java.awt.*;
 
public class LabelDemo extends Frame {
 
    public LabelDemo() {
 
        Label x = new Label("UserName");
        Label y = new Label("Password");
 
        x.setBounds(50, 100, 100, 30);
        y.setBounds(50, 450, 130, 330);
 
        this.add(x);
        this.add(y);
 
        this.setSize(500, 500);
        this.setVisible(true);
 
    }
 
    public static void main(String[] args) {
        LabelDemo ld = new LabelDemo();
    }
}

