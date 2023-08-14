import java.awt.*;

class SimpleChoiceExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple Choice Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Creating a choice menu
        Choice choice = new Choice();

        // Adding items to the choice menu
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");

        // Using choice menu methods
        String selectedItem = choice.getSelectedItem();
        int selectedIndex = choice.getSelectedIndex();
        int itemCount = choice.getItemCount();
        choice.select(1);
        String selectedText = choice.getSelectedItem();

        // Displaying results
        System.out.println("Selected Item: " + selectedItem);
        System.out.println("Selected Index: " + selectedIndex);
        System.out.println("Item Count: " + itemCount);
        System.out.println("Selected Text after select: " + selectedText);

        // Displaying the frame
        frame.add(choice);
        frame.setVisible(true);
    }
}
