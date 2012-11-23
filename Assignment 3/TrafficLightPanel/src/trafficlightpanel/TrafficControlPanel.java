/*
 * TrafficControlPanel.java
 */
package trafficlightpanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficControlPanel extends JPanel
{
    private JButton push;
    
    TrafficLightPanel trafficChange = new TrafficLightPanel();
    
    public TrafficControlPanel() 
    {   
        push = new JButton ("Change Light");
        push.addActionListener (new ChangeListener());
        setLayout(new BorderLayout());
        add(trafficChange, BorderLayout.CENTER);
        add (push, BorderLayout.SOUTH);
    }
    /*
     * push button listener
     */
    private class ChangeListener implements ActionListener
    {
       public void actionPerformed (ActionEvent event)
       {
           trafficChange.change();      
       }
    }
}
