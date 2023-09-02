import javax.swing.*;

class NestedMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu subMenu = new JMenu("Sub Menu");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem subMenuItem1 = new JMenuItem("Sub Menu Item 1");
        JMenuItem subMenuItem2 = new JMenuItem("Sub Menu Item 2");

        subMenu.add(subMenuItem1);
        subMenu.add(subMenuItem2);

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(subMenu); // Add the sub-menu
        fileMenu.add(saveItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
