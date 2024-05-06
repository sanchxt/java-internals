package unit4;

import javax.swing.*;
import java.awt.event.*;

public class AdapterClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adapter Example");

        JLabel label = new JLabel("Click Me");

        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Label clicked!");
            }
        };
        label.addMouseListener(mouseAdapter);

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
