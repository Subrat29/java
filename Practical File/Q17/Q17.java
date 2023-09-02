import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Q17 implements ActionListener {
    JFrame f;
    JFileChooser fileChooser;
    JTextArea textArea;
    String selectedText;
    Font f1, f2, f3, f4, f5;
    Color lightBlue, lightGreen, lightGray, cream, lavender;

    Q17() {

        // Font
        f1 = new Font("Arial", Font.PLAIN, 14);
        f2 = new Font("Helvetica", Font.BOLD, 18);
        f3 = new Font("Courier New", Font.ITALIC, 16);
        f4 = new Font("Georgia", Font.PLAIN, 20);
        f5 = new Font("Impact", Font.BOLD, 24);

        // Color
        lightBlue = new Color(173, 216, 230);
        lightGreen = new Color(144, 238, 144);
        lightGray = new Color(211, 211, 211);
        cream = new Color(255, 253, 208);
        lavender = new Color(230, 230, 250);

        // Frame
        f = new JFrame("Notepad");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Menubar
        JMenuBar mb = new JMenuBar();

        // Menu1
        JMenu menu1 = new JMenu("File");
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m12 = new JMenuItem("Save");
        JMenuItem m13 = new JMenuItem("Exit");

        // Menu2
        JMenu menu2 = new JMenu("Edit");
        JMenuItem m21 = new JMenuItem("Cut");
        JMenuItem m22 = new JMenuItem("Copy");
        JMenuItem m23 = new JMenuItem("Paste");

        // Menu3 - Menu inside menu
        JMenu menu3 = new JMenu("View");

        JMenu fontMenu = new JMenu("Font");
        JMenuItem font1 = new JMenuItem("Font1");
        JMenuItem font2 = new JMenuItem("Font2");
        JMenuItem font3 = new JMenuItem("Font3");
        JMenuItem font4 = new JMenuItem("Font4");
        JMenuItem font5 = new JMenuItem("Font5");

        JMenu textAreaColor = new JMenu("TextArea Color");
        JMenuItem blue = new JMenuItem("lightBlue");
        JMenuItem green = new JMenuItem("lightGreen");
        JMenuItem gray = new JMenuItem("lightGray");
        JMenuItem cream = new JMenuItem("cream");
        JMenuItem lavender = new JMenuItem("lavender");

        menu1.add(m11);
        menu1.add(m12);
        menu1.add(m13);

        menu2.add(m21);
        menu2.add(m22);
        menu2.add(m23);

        menu3.add(fontMenu);
        menu3.add(textAreaColor);

        fontMenu.add(font1);
        fontMenu.add(font2);
        fontMenu.add(font3);
        fontMenu.add(font4);
        fontMenu.add(font5);

        textAreaColor.add(blue);
        textAreaColor.add(green);
        textAreaColor.add(gray);
        textAreaColor.add(cream);
        textAreaColor.add(lavender);

        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);

        f.setJMenuBar(mb);
        f.setLayout(new BorderLayout());
        f.setSize(500, 500);

        // TextArea
        textArea = new JTextArea();
        f.add(new JScrollPane(textArea), BorderLayout.CENTER);
        f.setVisible(true);

        // FileChooser
        fileChooser = new JFileChooser();

        // Registration
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);

        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);

        font1.addActionListener(this);
        font2.addActionListener(this);
        font3.addActionListener(this);
        font4.addActionListener(this);
        font5.addActionListener(this);

        blue.addActionListener(this);
        green.addActionListener(this);
        gray.addActionListener(this);
        cream.addActionListener(this);
        lavender.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        // Open
        if (s.equals("Open")) {

            int returnValue = fileChooser.showOpenDialog(f);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                try (FileReader reader = new FileReader(selectedFile)) {

                    // This line reads the content of the file into the buffer character array.
                    char[] buffer = new char[(int) selectedFile.length()];

                    // The read method of the FileReader class reads characters from the file and
                    // stores them in the buffer.
                    reader.read(buffer);

                    // buffer content converted into string and set to textarea
                    textArea.setText(new String(buffer));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        // Save
        if (s.equals("Save")) {
            int returnValue = fileChooser.showSaveDialog(f);

            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                try (FileWriter writer = new FileWriter(selectedFile)) {
                    writer.write(textArea.getText());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }

        // Cut
        if (s.equals("Cut")) {
            textArea.cut();
        }

        // Copy
        if (s.equals("Copy")) {
            textArea.copy();
        }

        // Paste
        if (s.equals("Paste")) {
            textArea.paste();
        }

        // TextArea Font
        if (s.equals("Font1")) {
            textArea.setFont(f1);
        } else if (s.equals("Font2")) {
            textArea.setFont(f2);
        } else if (s.equals("Font3")) {
            textArea.setFont(f3);
        } else if (s.equals("Font4")) {
            textArea.setFont(f4);
        } else if (s.equals("Font5")) {
            textArea.setFont(f5);
        }

        // TextArea Color
        if (s.equals("lightBlue")) {
            textArea.setBackground(lightBlue);
        } else if (s.equals("lightGreen")) {
            textArea.setBackground(lightGreen);
        } else if (s.equals("lightGray")) {
            textArea.setBackground(lightGray);
        } else if (s.equals("cream")) {
            textArea.setBackground(cream);
        } else if (s.equals("lavender")) {
            textArea.setBackground(lavender);
        }

        // Exit
        if (s.equals("Exit")) {
            f.dispose();
        }
    }

    public static void main(String[] args) {
        new Q17();
    }
}