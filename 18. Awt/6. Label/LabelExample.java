import java.awt.*;

public class LabelExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Label Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Creating labels using different constructors
        Label label1 = new Label("Label with default alignment");
        Label label2 = new Label("Center Aligned Label", Label.CENTER);
        Label label3 = new Label("Right Aligned Label", Label.RIGHT);

        // Setting the alignment for label1
        label1.setAlignment(Label.LEFT);

        // Adding labels to the frame
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        // Using label methods
        label1.setText("Updated Label Text");
        String labelText = label2.getText();
        int labelAlignment = label3.getAlignment();

        // Displaying label methods' results
        System.out.println("Label 2 Text: " + labelText);
        System.out.println("Label 3 Alignment: " + labelAlignment);

        frame.setVisible(true);
    }
}
