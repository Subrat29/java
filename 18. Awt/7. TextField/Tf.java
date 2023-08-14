import java.awt.*;

class Tf {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple TextField Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Creating a text field using different constructors
        TextField textField1 = new TextField(); // Default constructor
        TextField textField2 = new TextField(15); // Constructor with columns
        TextField textField3 = new TextField("Initial Text"); // Constructor with initial text
        TextField textField4 = new TextField("Initial Text", 10); // Constructor with initial text and columns

        // Adding text fields to the frame
        frame.add(textField1);
        frame.add(textField2);
        frame.add(textField3);
        frame.add(textField4);

        // Using text field methods
        textField1.setText("Modified Text");
        String text1 = textField2.getText();
        textField3.select(2, 6);
        String selectedText = textField3.getSelectedText();
        boolean isEditable = textField4.isEditable();
        textField4.setEditable(!isEditable);

        // Displaying results
        System.out.println("Text Field 1 Text: " + text1);
        System.out.println("Selected Text: " + selectedText);
        System.out.println("Is Editable: " + isEditable);

        // Displaying the frame
        frame.setVisible(true);
    }
}
