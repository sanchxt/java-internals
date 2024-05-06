package unit4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingButtons {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Buttons Example");
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Button");
        JToggleButton toggleButton = new JToggleButton("Toggle Button");
        JCheckBox checkBox = new JCheckBox("Check Box");
        
        // Create a button group for radio buttons
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton radioButton1 = new JRadioButton("Radio Button 1");
        JRadioButton radioButton2 = new JRadioButton("Radio Button 2");
        // Add radio buttons to the button group
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);

        // Add action listeners
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });

        toggleButton.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (toggleButton.isSelected())
                    System.out.println("Toggle button selected");
                else
                    System.out.println("Toggle button deselected");
            }
        });

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkBox.isSelected())
                    System.out.println("Check box checked");
                else
                    System.out.println("Check box unchecked");
            }
        });

        radioButton1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton1.isSelected())
                    System.out.println("Radio button 1 selected");
            }
        });

        radioButton2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (radioButton2.isSelected())
                    System.out.println("Radio button 2 selected");
            }
        });

        frame.add(button);
        frame.add(toggleButton);
        frame.add(checkBox);
        frame.add(radioButton1);
        frame.add(radioButton2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
