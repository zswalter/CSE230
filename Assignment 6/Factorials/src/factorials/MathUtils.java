/*
 * MathUtils.java
 * 
 * Provides static mathmatical utility functions.
 */
package factorials;

public class MathUtils 
{
    //Returns the factorial of the argument given
    public static int factorial(int n)
    {
        IllegalArgumentException negative = new 
                IllegalArgumentException("The integer is negative!"
                + " Please enter a positive Integer");
        IllegalArgumentException large = new 
                IllegalArgumentException("The integer is too large!"
                + " Please enter an Integer less than 16");
        if (n < 0)
            throw negative;
        if (n > 16)
            throw large;
        int fac = 1;
        for (int i = n; i>0; i--)
            fac *=i;
        return fac;
    }
}
