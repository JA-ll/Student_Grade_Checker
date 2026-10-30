import javax.swing.*;
import java.awt.*;

public class Calculator_GUI {
    public static void main( String [] args ){
        JFrame frame = new JFrame("Report");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        frame.setVisible(true);
    }
}    