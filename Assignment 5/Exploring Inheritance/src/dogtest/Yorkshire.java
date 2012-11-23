/*
 * Yorkshire.java
 * 
 * A class derived from Dog that holds information about Yorkshire terrier.
 * Overrides Dog speak method.
 */

package dogtest;

public class Yorkshire extends Dog
{
    public static int breedWeight = 10;
    public Yorkshire(String name)
    {
        super(name);
    }
    
    /*
     * Small bark
     */
    public String speak()
    {
        return "woof";
    }
    
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}
