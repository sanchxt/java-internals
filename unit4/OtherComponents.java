package unit4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OtherComponents {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Example");

        JTextField textField = new JTextField(20);

        // Create a JScrollPane and add the JTextField to it
        JScrollPane scrollPane = new JScrollPane(textField);

        // Create a JList
        String[] listItems = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(listItems);

        // Create a JComboBox
        String[] comboItems = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
        JComboBox<String> comboBox = new JComboBox<>(comboItems);

        // Add action listener to JComboBox
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                textField.setText(selectedItem);
            }
        });

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(scrollPane);
        panel.add(new JScrollPane(list));
        panel.add(comboBox);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
