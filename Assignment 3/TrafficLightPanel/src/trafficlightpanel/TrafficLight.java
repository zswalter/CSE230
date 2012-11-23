/*
 * TrafficLight.java
 * 
 * Driver class for traffic light
 */
package trafficlightpanel;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrafficLight 
{

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Traffic Light");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new TrafficControlPanel());
        frame.pack();
        frame.setVisible(true);
    }
    
}
