import javax.swing.*;
import javax.swing.ImageIcon;


public class MessageDialog2 {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("car.png");

        JOptionPane.showMessageDialog(null, "Enter Correct Password", "Title",JOptionPane.PLAIN_MESSAGE,icon);
        
    } 
}