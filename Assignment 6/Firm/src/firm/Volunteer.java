/*
 * Volunteer.java
 * 
 * represents a staff member that works as a volunteer
 */
package firm;

public class Volunteer extends StaffMember
{
    //constructor: sets up this volunteer using the specific information
    public Volunteer(String eName, String eAddress, String ePhone)
    {
        super (eName, eAddress, ePhone);
    }
    
    //returns a zero pay value for this volunteer
    public double pay()
    {
        return 0.0;
    }
}
