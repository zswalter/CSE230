/*
 * TelephonePanel.java
 * 
 * lays out a (functionless) GUI like a telephone keypad with a title. 
 * Illistrates use of BorderLayout and GridLayout.
 */
package telephone;
import java.awt.*;
import javax.swing.*;

public class TelephonePanel extends JPanel
{
    public TelephonePanel()
    {
        //set BorderLayout for this panel
        setLayout(new BorderLayout());
        
        //create JLabel with "Your Telephone" title
        JLabel title = new JLabel("Your Telephone!!");
        
        //create panel for title
        JPanel titlePanel = new JPanel();
        
        //add title to title panel
        titlePanel.add(title);
        
        //add title label to north of this panel
        add(titlePanel, BorderLayout.NORTH);
        
        //create panel to hold keypad and give it 4x3 GridLayout
        GridLayout layout = (new GridLayout(4, 3));
        
        //add buttons representing keys to key panel
        JPanel keyPanel = new JPanel(layout);
        
        //Create buttons
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");
        JButton bStar = new JButton("*");
        JButton bPound = new JButton("#");
        
        //add buttons to key panel
        keyPanel.add(b1);
        keyPanel.add(b2);
        keyPanel.add(b3);
        keyPanel.add(b4);
        keyPanel.add(b5);
        keyPanel.add(b6);
        keyPanel.add(b7);
        keyPanel.add(b8);
        keyPanel.add(b9);
        keyPanel.add(bStar);
        keyPanel.add(b0);
        keyPanel.add(bPound);
        
        // add key panel to center of this panel
        add(keyPanel, BorderLayout.CENTER); 
    }
}
