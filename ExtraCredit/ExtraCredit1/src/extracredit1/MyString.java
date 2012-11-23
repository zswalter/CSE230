/*
 * MyString.java
 * 
 * Create MyString Objects and create compareTo() method
 */

package extracredit1;

public class MyString 
{
    
    /*
     * declare private variables
     */
    
    private int length = 0, result = 0, longest = 0;
    private String strComp, getStr, substr1, substr2;
    
    /*
     * Create objects with MyString method
     */
    
    public MyString(String str)
    {
        
         strComp = str;
         
    }
    
    /*
     * Compare MyStrings by compareTo() method within MyString
     */
    
    public int compareTo(MyString str)
    {
        
        getStr = str.str();
        compare(strComp, getStr);
        compareString(strComp, getStr);
        return result;
        
    }
    
    /* 
     * convert str MyString object, from compareTo(), to a String
     */
    
    public String str()
    {
        
        return strComp;
        
    }
    
    /*
     * Find out what string is longer
     */
    
    public void compare(String one, String two)
    {
        
      if (one.length() > two.length())
      {
          
          longest = 0;
          
      }     else {longest = 1;} 
      
    }
    
    /*
     * Compares each character to the coresponding charecter between 2 strings
     * for example str1.compareTo(str2)
     * the virst character that is different returns the difference of 
     * str1.hashCode()-str2.hashCode()
     * if the characters are the same and the strings are different lengths, 
     * the value of str1.length()-str2.length() is returned
     * it the strings are equal a 0 will be returned
     */
    
    public void compareString(String one, String two)
    {
        
        //string two is shoter
        if (longest == 0)
        {
            
            //set the for loop to stop at the end of string two
            length = getStr.length();
            
            //if string two's length is 0 then set length to 1 so the for loop 
            //runs.
            if (length == 0)
                    {
                       length = 1; 
                    }
            
            //go through and compare character by character
            for (int i = 0; i < length; i++)
            {
                //set substring 1 to the character at index i
                substr1 = strComp.substring(i,i + 1);
                
                //if string two is 1 or 0 in length the set the substring 2 to 
                //string two, else get character at index i
                if (length == 1)
                { 
                substr2 = getStr;
                } else {substr2 = getStr.substring(i,i + 1);}
                
                //get the difference between the characters at index i
                result = substr1.hashCode() - substr2.hashCode();
                
                //if the characters are not the same exit the loop
                //if the loop has gone through all the characters of the
                //shorter string take the difference of the lengths
                if (result != 0)
                {
                    
                    //if the shortest string is 0 in length take the difference
                    //of the lengths
                    if (getStr.length() == 0)
                    {
                        result = strComp.length() - getStr.length();    
                    }
                    
                    i = getStr.length();
                    
                }else {result = strComp.length() - getStr.length();}
                
            }
            
        }
        //string one is shoter
        else
        {
            
            //set the for loop to stop at the end of string one
            length = strComp.length();
            
            //if string one's length is 0 then set length to 1 so the for loop 
            //runs.
            if (length == 0)
                    {
                       length = 1;
                    }
            
            //go through and compare character by character
            for (int i = 0; i < length; i++)
            {
                
                //if string one is 1 or 0 in length the set the substring 1 to 
                //string one, else get character at index i
                if (length == 1)
                {
                substr1 = strComp;
                } else {substr1 = strComp.substring(i,i + 1);}
                
                //set substring 2 to the character at index i
                substr2 = getStr.substring(i, i + 1);
                
                //get the difference between the characters at index i
                result = substr1.hashCode() - substr2.hashCode();
                
                //if the characters are not the same exit the loop
                //if the loop has gone through all the characters of the
                //shorter string take the difference of the lengths
                if (result != 0)
                {
                    
                    //if the shortest string is 0 in length take the difference
                    //of the lengths
                    if (strComp.length() == 0)
                    {
                        result = strComp.length() - getStr.length();
                    }
                    
                    i = strComp.length();
                    
                } else {result = strComp.length() - getStr.length();}
                
            }
            
        }
       
    }
    
}
