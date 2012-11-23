/*
 * 
 * program to display devil gif in nested panels
 * 
 */
package devil;

import java.awt.*;
import javax.swing.*;

public class Devil 

{
    public static void main(String[] args)
    {
        //create frame
        JFrame frame = new JFrame ("Devil");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        
        //create lables
        JLabel label1, label2, label3;
        
        //create image icon
        ImageIcon devil = new ImageIcon ("devil.gif");
        
        //create nested panel one
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize(new Dimension(150, 100));
        subPanel1.setBackground (Color.CYAN);
        label1 = new JLabel ("Devil Left", devil, SwingConstants.CENTER);
        subPanel1.add(label1);
        
        //create nested panel two
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(150, 100));
        subPanel2.setBackground (Color.RED);
        label2 = new JLabel ("Devil Right", devil, SwingConstants.CENTER);
        label2.setHorizontalTextPosition (SwingConstants.LEFT);
        subPanel2.add(label2);
        
        //create nested panel three
        JPanel subPanel3 = new JPanel();
        subPanel3.setPreferredSize(new Dimension(150, 100));
        subPanel3.setBackground (Color.BLUE);
        label3 = new JLabel ("Devil Above", devil, SwingConstants.CENTER);
        label3.setVerticalTextPosition (SwingConstants.BOTTOM);
        subPanel3.add(label3);
       
        //create main background panel
        JPanel primary = new JPanel();
        primary.setBackground(Color.yellow);
        primary.add (subPanel1);
        primary.add (subPanel2);
        primary.add (subPanel3);
        
        //show panels
        frame.getContentPane().add(primary);
        frame.pack();
        frame.setVisible(true);
               
    }
}
