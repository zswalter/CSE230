/*
 * Comparisons.java
 */
package comparisons;

import java.util.Scanner;

public class Comparisons 
{
    public static void main(String[] args) 
    {
        String str1, str2, str3, big;  //declare string inputs
        Compare3 biggest = new Compare3();
        
        Scanner scan = new Scanner(System.in);
        
        // get compareables
        System.out.println();
        System.out.print("Enter first string: ");
        str1 = scan.nextLine();
        System.out.print("Enter second string: ");
        str2 = scan.nextLine();
        System.out.print("Enter third string: ");
        str3 = scan.nextLine();
        
        //find largest using largest method
        big = biggest.largest(str1, str2, str3);
        
        //print largest
        System.out.println();

        if (big.compareTo("Items are equal") == 0) 
        {
            System.out.println(big);
        }
        else{System.out.println("The largest is: " + big);}
        
        // get compareables
        System.out.println();
        System.out.print("Enter first integer: ");
        str1 = scan.nextLine();
        System.out.print("Enter second integer: ");
        str2 = scan.nextLine();
        System.out.print("Enter third integer: ");
        str3 = scan.nextLine();
        
        //find largest using largest method
        big = biggest.largest(str1, str2, str3);
        
        //print largest
        System.out.println();

        if (big.compareTo("Items are equal") == 0) 
        {
            System.out.println(big);
        }
        else{System.out.println("The largest is: " + big);}
    }
}
