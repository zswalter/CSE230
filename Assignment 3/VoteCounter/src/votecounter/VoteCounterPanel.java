/*
 * VoteCOunterPane.java
 * 
 * Demonstrates a graphical user interface and event listeners to tally votes
 * for two candidates, Joe and Sam.
 */
package votecounter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VoteCounterPanel extends JPanel
{
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    
    /*
     * Constructor: Sets up GUI.
     */
    public VoteCounterPanel()
    {
        votesForJoe =0;
        
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new JoeButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        
        sam = new JButton("Vote for Sam");
        sam.addActionListener(new SamButtonListener());
        labelSam = new JLabel("Votes for Sam: " + votesForJoe);
        
        add(joe);
        add(labelJoe);
        add(sam);
        add(labelSam);        
        setPreferredSize(new Dimension(600, 40));
        setBackground(Color.cyan);
    }
    /*
     * Represents a listener for Button pus (action) events
     */
    private class JoeButtonListener implements ActionListener
    {
        /*
        * Updates the counter and label when Vote for Joe button is pushed
        */
        public void actionPerformed(ActionEvent event)
        {
            votesForJoe++;
            labelJoe.setText("Votes for Joe: " +votesForJoe);
        } 
    }
    private class SamButtonListener implements ActionListener
    {
        /*
        * Updates the counter and label when Vote for Sam button is pushed
        */
        public void actionPerformed(ActionEvent event)
        {
            votesForSam++;
            labelSam.setText("Votes for Sam: " +votesForSam);
        }
    }
}
