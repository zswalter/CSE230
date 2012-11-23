/*
 * ExtraCradit.java
 * 
 * This is the driver class to compare two strings using compareTo() method
 * within MyString.java class
 */
package extracredit1;

public class ExtraCredit1 
{

    public static void main(String[] args) 
    {
        /*
         * Definr MyString Strings! and result
         */
        
        MyString str1, str2, str3; 
        int result;
        
        /*
         * Assing strings to MyString Objects
         */
        
        str1 = new MyString("Hello World!");
        str2 = new MyString("Hello World!");
        str3 = new MyString("Hi!");
        
        /*
         * Use compareTo() method withing MyString class to compare strings
         * and print the output
         */
        
        result = str1.compareTo(str2);
        System.out.println("'" + str1.str() + "' compared to '" + str2.str()
                + "' is: " + result);
        result = str1.compareTo(str3);
        System.out.println("'" + str1.str() + "' compared to '" + str3.str() 
                + "' is: " + result);
        result = str3.compareTo(str1);
        System.out.println("'" + str3.str() + "' compared to '" + str1.str() 
                + "' is: " + result);
        
    }
    
}
