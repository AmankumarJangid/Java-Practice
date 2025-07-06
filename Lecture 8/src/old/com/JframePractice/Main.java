package old.com.JframePractice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("This is a practice frame");

        JLabel label1 = new JLabel("This is a new label", JLabel.CENTER);
        label1.setForeground(Color.red);
        label1.setBackground(Color.black);

        frame.setLayout( new BorderLayout());
        frame.add(label1, BorderLayout.NORTH);


        frame.getContentPane().setBackground(Color.darkGray);
        frame.setMinimumSize( new Dimension(400,200));




        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
