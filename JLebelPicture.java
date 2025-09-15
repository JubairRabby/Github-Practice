import javax.swing.*;

public class JLebelPicture {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("JLabel Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image
        ImageIcon icon = new ImageIcon("car.PNG");

        // Create a label with text and icon
        JLabel label = new JLabel("Welcome to Swing!", icon, SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);  // Text position relative to icon
        label.setVerticalTextPosition(SwingConstants.BOTTOM);    // Text under the image
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));
        label.setForeground(java.awt.Color.MAGENTA);

        // Add label to the frame
        frame.add(label);

        // Set frame visible
        frame.setVisible(true);
    }
}