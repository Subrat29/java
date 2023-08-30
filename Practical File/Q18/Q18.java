import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LineDrawingApplet extends Applet {
    private int startX, startY, endX, endY;

    public void init() {
        setSize(500, 500);
        setBackground(Color.white);

        addMouseListener(new MyMouseListener());
    }

    class MyMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            startX = e.getX();
            startY = e.getY();
        }

        public void mouseReleased(MouseEvent e) {
            endX = e.getX();
            endY = e.getY();
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawLine(startX, startY, endX, endY);
    }
}
