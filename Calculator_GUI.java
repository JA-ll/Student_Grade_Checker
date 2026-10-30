import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        frame.setLayout(null); 

        JLabel lblNamee = new JLabel("Name:");
        lblNamee.setBounds(50, 80, 100, 30);
        JTextField txtname = new JTextField(30);
        JLabel lblgradee = new JLabel("Gradee:");
        JTextField txtgrade = new JTextField(30);

        JButton BtnResult = new JButton("Show Result");
        JButton BtnClear = new JButton("Clear");

        frame.add(lblNamee);
        frame.add(txtname);
        frame.add(lblgradee);
        frame.add(txtgrade);
        frame.add(BtnResult);
        frame.add(BtnClear);

        frame.setVisible(true);
    }
}    