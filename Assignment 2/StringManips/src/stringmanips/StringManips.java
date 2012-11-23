/*
 * StringManips.java
 * 
 * Test several methods for manipulating String objects
 * 
 */
package stringmanips;

import java.util.Scanner;

public class StringManips 

{
    
    public static void main(String[] args)
            
    {   
        String phrase = new String ("This is a String test.");
        int phraseLength; // number of characters in the phrase String
        int middleIndex; // index of the middle character in the String
        String firstHalf; // first half of the phrase String
        String secondHalf; // second half of the phrase String
        String switchedPhrase; // a new phrase with original halves switched
        String middle3; //middle 3 char
        String city; //city
        String state; //state
        
        // compute the length and middle index of the phrase
        phraseLength = phrase.length();
        middleIndex = phraseLength / 2;
        
        // get the substring for each half of the phrase
        firstHalf = phrase.substring(0,middleIndex);
        secondHalf = phrase.substring(middleIndex, phraseLength);
        
        // concatenate the firstHalf at the end of the secondHalf
        switchedPhrase = secondHalf.concat(firstHalf);
        switchedPhrase = switchedPhrase.replace(' ', '*');
        
        //get middle 3 characters
        middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);
        
        // print information about the phrase
        System.out.println();
        System.out.println ("Original phrase: " + phrase);
        System.out.println ("Length of the phrase: " + phraseLength +
                            " characters");
        System.out.println ("Index of the middle: " + middleIndex);
        System.out.println ("Character at the middle index: " +
                            phrase.charAt(middleIndex));
        System.out.println ("Switched phrase: " + switchedPhrase);
        System.out.println();
        System.out.println("Middle 3 Characters: " + middle3);
        
        //Get city and state
        Scanner cityState = new Scanner (System.in);
        System.out.println("Please enter your city: ");
        city = cityState.nextLine();
        System.out.println("Please enter your state: ");
        state = cityState.nextLine();
        state = state.toUpperCase();
        city = city.toLowerCase();
        System.out.println(state + city + state);
        

    }
}
