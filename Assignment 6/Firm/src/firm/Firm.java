/*
 * Firm.java
 * 
 * Demonstrates polymorphism via inheritance
 */
package firm;

public class Firm 
{

    public static void main(String[] args)
    {
        //Creates a staff of employees for a firm and pays them.
        Staff personnel = new Staff();
        
        personnel.payday();
    }
}
