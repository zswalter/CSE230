/*
 * Eployee.java
 * 
 * Represents a general paid employee
 */
package firm;

public class Employee extends StaffMember
{
    protected String socialSecurityNumber;
    protected double payRate;
    
    //Constructor: sets up this employee with the specified information
    public Employee (String eName, String eAddress, 
            String ePhone, String socSecNumber, double rate)
    {
        super (eName, eAddress, ePhone);
        
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }
    
    //returns information about an employee as a string
   public String toString()
   {
       String result = super.toString();
       
       result += "\nSocial Security Number: " + socialSecurityNumber;
       return result;
   }
   
   //returns the pay for this employee
   public double pay()
   {
       return payRate;
   }
}
