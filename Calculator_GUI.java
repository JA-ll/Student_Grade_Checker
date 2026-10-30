import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
        JFrame frame = new JFrame("Report");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

<<<<<<< HEAD
         JLabel lblName = 
            new JLabel("Enter your name:"); 
 
        JTextField txtName = 
            new JTextField(15); 

            frame.add(lblName);
            frame.add(txtName);
=======
        JLabel lblName = new JLabel("Name:");
        JTextField txtname = new JTextField(30);
        JLabel lblgrade = new JLabel("Grade:");
        JTextField txtgrade = new JTextField(30);

        frame.add(lblName);
        frame.add(txtname);
        frame.add(lblgrade);
        frame.add(txtgrade);
>>>>>>> d150457778211f5b8b5720facbf4f8f07a33c217

        frame.setVisible(true);
    }
}    