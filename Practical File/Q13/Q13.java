/*<!DOCTYPE html>
<html>
<head>
    <title>Button Applet</title>
</head>
<body>
    <applet code="ButtonApplet.class" width="300" height="200"></applet>
</body>
</html>
*/

import java.applet.Applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Myapplet extends Applet implements ActionListener {
    Button b;

    public void init() {
        b = new Button("Click");
         add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            System.out.println("buttton Clicked");
        }
    }
}