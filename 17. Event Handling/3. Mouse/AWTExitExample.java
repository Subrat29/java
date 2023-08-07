import java.awt.*;
import java.awt.event.*;

public class AWTExitExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Exit Example");
        
        // Add a WindowListener to handle the close operation
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = MessageBox.confirm(frame, "Do you want to exit?");
                if (result == MessageBox.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        Label label = new Label("Click the close button to test");
        frame.add(label);

        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}

class MessageBox {
    public static final int YES_OPTION = 0;
    public static final int NO_OPTION = 1;


}
