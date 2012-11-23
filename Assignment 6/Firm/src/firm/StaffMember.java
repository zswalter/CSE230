/*
 * StaffMember.java
 * 
 * Represents a generic staff member.
 */
package firm;

abstract public class StaffMember 
{
   protected String name;
   protected String address;
   protected String phone;
   
   //constructor: sets up this staff member using the specified information
   public StaffMember (String eName, String eAddress, String ePhone)
   {
       name = eName;
       address = eAddress;
       phone = ePhone;
   }
   
   //returns a string including the basic employee information
   public String toString()
   {
       String result = "Name: " + name + "\n";
       
       result += "Address: " + address + "\n";
       result += "Phone: " + phone;
       
       return result;
   }
   
   //derives classes must define the pay method for each type of employee
   public abstract double pay();
}
