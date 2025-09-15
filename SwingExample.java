import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First Swing App");  // Create a window
        JButton button = new JButton("Click Me");         // Create a button

        button.setBounds(130, 100, 100, 40); // set position and size
        frame.add(button);                   // add button to frame

        frame.setSize(400, 300);   // set window size
        frame.setLayout(null);     // no layout manager
        frame.setVisible(true);    // display the window
    }
}
