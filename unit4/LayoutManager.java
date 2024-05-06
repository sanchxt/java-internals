package unit4;

import javax.swing.*;
import java.awt.*;

public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout Manager Example");

        JPanel panel = new JPanel(new BorderLayout());

        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");

        panel.add(northButton, BorderLayout.NORTH);
        panel.add(southButton, BorderLayout.SOUTH);
        panel.add(eastButton, BorderLayout.EAST);
        panel.add(westButton, BorderLayout.WEST);
        panel.add(centerButton, BorderLayout.CENTER);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
