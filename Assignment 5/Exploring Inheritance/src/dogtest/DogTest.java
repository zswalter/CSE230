/*
 * DogTest.java
 * 
 * A simple test class that creates a Dog and makes it speak.
 */

package dogtest;

public class DogTest 
{

    public static void main(String[] args) 
    {
        //Dog dog = new Dog("Spike");
        //System.out.println(dog.getName() + " says " + dog.speak());
        
        Dog lab = new Labrador("Moose", "Black");
        System.out.println(lab.getName() + " says " + lab.speak());
        
        Dog yorky = new Yorkshire("Bella");
        System.out.println(yorky.getName() + " says " + yorky.speak());
        
        System.out.println("Average Labrador Retriver weight is: "
                            + lab.avgBreedWeight());
        System.out.println("Average Yorkshire Terrier weight is: "
                            + yorky.avgBreedWeight());
        
    }
}
