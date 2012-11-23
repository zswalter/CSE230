/*
 * Telephone.java
 * 
 * uses the TelephonePanel class to create a (functionless) GUI like a telephone
 * keypad with a title. Illistrates use of BordeLayout and GridLayout.
 */
package telephone;
import javax.swing.*;
public class Telephone 
{
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Telephone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new TelephonePanel());
        frame.pack();
        frame.setVisible(true);
    }
}
