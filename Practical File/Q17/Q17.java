import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Q17 implements ActionListener {
    JFrame f;
    JFileChooser fileChooser;
    JTextArea textArea;

    Q17() {
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

        menu1.add(m11);
        menu1.add(m12);
        menu1.add(m13);

        menu2.add(m21);
        menu2.add(m22);
        menu2.add(m23);

        mb.add(menu1);
        mb.add(menu2);

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

        // Exit
        if (s.equals("Exit")) {
            f.dispose();
        }

    }

    public static void main(String[] args) {
        new Q17();
    }
}