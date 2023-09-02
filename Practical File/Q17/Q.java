import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class SelectedTextExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Selected Text Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextArea textArea = new JTextArea("This is a sample text area.");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JButton retrieveButton = new JButton("Retrieve Selected Text");

        retrieveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedText = textArea.getSelectedText();
                if (selectedText != null) {
                    JOptionPane.showMessageDialog(frame, "Selected Text: " + selectedText);
                } else {
                    JOptionPane.showMessageDialog(frame, "No text selected.");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(retrieveButton);

        frame.add(textArea, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}
