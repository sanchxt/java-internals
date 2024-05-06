package unit4;

import javax.swing.*;
import java.awt.event.*;

public class SwingExample extends JFrame {

    public SwingExample() {
        super("My First Swing App");

        JButton button = new JButton("Click Me!");
        JLabel label = new JLabel("Click the button to change the text!");

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);
        add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!");
            }
        });

        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingExample().setVisible(true);
            }
        });
    }
}
