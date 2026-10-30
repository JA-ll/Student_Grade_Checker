import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
<<<<<<< HEAD
        JFrame frame = new JFrame("Calculator");
        frame.setSize(500, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        frame.setLayout(null); 

        JLabel lblNamee = new JLabel("Name:");
        lblNamee.setBounds(50, 80, 100, 30);
=======
        JFrame frame = new JFrame("Report");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        frame.setLayout(null);

        JLabel lblNamee = new JLabel("Namee:");
        lblNamee.setBounds(50,50,100,30);
>>>>>>> 59bed6d119f584c9ea90d3b254cef6a6a5c7804a
        JTextField txtname = new JTextField(30);
        txtname.setBounds(0,0,0,0);
        JLabel lblgradee = new JLabel("Gradee:");
        lblgradee.setBounds(0,0,0,0);
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