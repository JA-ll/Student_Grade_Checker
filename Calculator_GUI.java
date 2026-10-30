import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
        JFrame frame = new JFrame("Report");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        JLabel lblName = new JLabel("Name:");
        JTextField txtname = new JTextField(30);
        JLabel lblgrade = new JLabel("Grade:");
        JTextField txtgrade = new JTextField(30);

        JButton BtnResult = new JButton("Show Result");
         JButton BtnClear = new JButton("Clear");

        frame.add(lblName);
        frame.add(txtname);
        frame.add(lblgrade);
        frame.add(txtgrade);
        frame.add(BtnResult);
        frame.add(BtnClear);

        frame.setVisible(true);
    }
}    