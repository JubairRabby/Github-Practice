import javax.swing.*;
import java.awt.*;

public class JTextHigher {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("User Information Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout manager
        frame.setLayout(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, with gaps

        // Create Labels
        JLabel nameLabel = new JLabel("Enter your name:");
        JLabel ageLabel = new JLabel("Enter your age:");
        JLabel addressLabel = new JLabel("Enter your address:");

        // Customize labels
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        ageLabel.setFont(new Font("Arial", Font.BOLD, 16));
        addressLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Create TextFields
        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField addressField = new JTextField();

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(addressLabel);
        frame.add(addressField);

        // Set frame visible
        frame.setVisible(true);
    }
}