package unit4;

import javax.swing.*;
import java.awt.event.*;

public class EventSourceExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Source Example");

        JButton button = new JButton("Click Me");

        // Register an ActionListener with the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // This method is called when the button is clicked
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
