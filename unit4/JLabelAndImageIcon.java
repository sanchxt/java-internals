package unit4;

import javax.swing.*;

public class JLabelAndImageIcon {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ImageIcon Example");

        ImageIcon icon = new ImageIcon("unit4/image.jpg");

        // Create a JLabel with the ImageIcon
        JLabel label = new JLabel(icon);

        // Add the JLabel to the frame
        frame.add(label);

        // Set the default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Pack the components inside the frame
        frame.pack();

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}
