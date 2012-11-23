/*
 * Dog.java
 * 
 * A class that holds a dog's name and can make it speak
 */

package dogtest;

public abstract class Dog 
{
    
    protected String name;
    
    /*
     * Constructor -- store name
     */
    public Dog(String name)
    {
        this.name = name;
    }
    
    /*
     * Returns the dog's name
     */
    public String getName()
    {
        return name;
    }
    
    /*
     * returns a string with the dog's comments
     */
    public String speak()
    {
        return "Woof";
    }
    
    public abstract int avgBreedWeight();
}
