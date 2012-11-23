/*
 * Compare3.java
 */
package comparisons;

public class Compare3 
{
    private String largest;

    public Compare3() 
    {
    }
    
    public String largest(String one, String two, String three)
    {
        if (one.compareTo(two) > 0 && one.compareTo(three) > 0)
        {
            largest = one;
        }
        else if (two.compareTo(one) > 0 && two.compareTo(three) > 0)
        {
            largest = two;
        }
        else if (three.compareTo(one) > 0 && three.compareTo(two) > 0)
        {
            largest = three;
        }
        else{largest = "Items are equal";}
        return largest;
    }    
}
