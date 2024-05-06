package unit4;

import javax.swing.*;

public class ContainerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Container Example");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Add components to the panel
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        // Add the panel to the frame
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
