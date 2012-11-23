/*
 * TrafficLightPanel.java
 */

package trafficlightpanel;

import javax.swing.*;
import java.awt.*;

public class TrafficLightPanel extends JPanel
{
    private int currentState = 0;
    private final int NUM_LIGHTS = 3;   //the number of lights
    private final int X = 50, Y = 10, WIDTH = 50, HEIGHT = 130; //box size
    private final int DIAMETER = 30;    //light diameter
    private final int X_OFFSET = 10, Y_OFFSET = 10; //offsets to position of 
        //the lights in the box
    private final int PANEL_WIDTH = 150, PANEL_HEIGHT = 230; //the size of a
        //traffic control panel
    /*
     * creates the traffic light panel
     */
    public TrafficLightPanel()
    { 
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void paintComponent(Graphics page)
    {
        super.paintComponent(page);
        int lightOn = currentState % NUM_LIGHTS;
        setBackground(Color.white);
        page.setColor(Color.lightGray);
        page.fillRect(X, Y, WIDTH, HEIGHT); 
      if (lightOn == 0)
      {
            page.setColor(Color.red);
            page.fillOval(X_OFFSET + X, Y_OFFSET + Y, DIAMETER, DIAMETER);
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + X, 2 * Y_OFFSET + DIAMETER + Y, DIAMETER, DIAMETER);
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + X, 3 * Y_OFFSET + 2 * DIAMETER + Y, DIAMETER, DIAMETER);
       }
      else if (lightOn == 2)
      {
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 10, DIAMETER, DIAMETER);
            page.setColor(Color.yellow);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 50, DIAMETER, DIAMETER);
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 90, DIAMETER, DIAMETER);
       }
      else if (lightOn == 1)
      {
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 10, DIAMETER, DIAMETER);
            page.setColor(Color.darkGray);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 50, DIAMETER, DIAMETER);
            page.setColor(Color.green);
            page.fillOval(X_OFFSET + 50, Y_OFFSET + 90, DIAMETER, DIAMETER);
       }
        
    }
    
    public void change()
    {
        currentState++;
        repaint();
    }
} 
