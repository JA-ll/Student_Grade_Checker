import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
        JFrame frame = new JFrame("Report");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        frame.setLayout(null);

        JLabel lblNamee = new JLabel("Namee:");
        lblNamee.setBounds(50,50,100,30);
        JTextField txtname = new JTextField(30);
        txtname.setBounds(100,50,100,30);
        JLabel lblgradee = new JLabel("Gradee:");
        lblgradee.setBounds(50,100,100,30);
        JTextField txtgrade = new JTextField(30);
        txtgrade.setBounds(0,0,0,0);

        JButton BtnResult = new JButton("Show Result");
         JButton BtnClear = new JButton("Clear");

        frame.add(lblNamee);
        frame.add(txtname);
        frame.add(lblgradee);
        frame.add(txtgrade);
        frame.add(BtnResult);
        frame.add(BtnClear);
        frame.setSize(500, 600);

        frame.setVisible(true);
    }
}    