/*
 * Count.java
 * 
 * This program reads in stings (phrases) and counts the number of blank 
 * characters and certain letters in the phrase.
 */

package count;

import java.util.Scanner;

public class Count 
{
    public static void main(String[] args) 
    {
        String phrase; //a string of characters
        int countBlank, countA, countE, countS, countT; //the number of certian
                                                        //characters in the 
                                                        //phrase
        int length; //the length of the phrase
        int n = 1;
        char ch; //an individual character in the string.
        String quit = "QUIT";
        
        Scanner scan = new Scanner(System.in);
        
        //print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();
        
        while (n != 0){
        //Read in a string and find its length
        System.out.print("Enter a sentence or phrase(to quit type quit): ");
        phrase = scan.nextLine();
        phrase = phrase.toUpperCase();
        length = phrase.length();
        
        if (phrase.compareTo(quit) == 0)
        {
            n = 0;
        }
        else{
        //Initialize counts
        countBlank = 0;
        countA = 0;
        countE = 0;
        countS = 0;
        countT = 0;
        
        /*
         * a for loop to go through the string character by character and
         * count the blank space
         */
        for (int i = 0; i <= length - 1; i++)
        {
            ch = phrase.charAt(i);
            switch (ch)
            {
                case 32:
                    countBlank++;
                    break;
                case 65:
                    countA++;
                    break;
                case 69:
                    countE++;
                    break;
                case 83:
                    countS++;
                    break;
                case 84:
                    countT++;
                    break;
            }
        }
        //print the results
        System.out.println();
        System.out.println("Number of blank spaces: " + countBlank);
        System.out.println();
        System.out.println("Number of A's: " + countA);
        System.out.println();
        System.out.println("Number of E's: " + countE);
        System.out.println();
        System.out.println("Number of S's: " + countS);
        System.out.println();
        System.out.println("Number of T's: " + countT);
        System.out.println();
        }
        }
    }
}
