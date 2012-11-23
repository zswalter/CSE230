/*
 * A Bank account class with methods to deposit to, withdraw from, change the
 * name on, charge a fee to, and print a summary of the account
 */
package account;

import java.text.NumberFormat;

public class Account 
{
    /*
     * Define Class variabes
     */
    private double balance;
    private String name;
    private long acctNum;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    /*
     * Constructor -- initializes balance, owner, and account number
     */
    
    public Account(double initBal, String owner, long number)
    {
        balance = initBal;
        name= owner;
        acctNum = number;
    }
    
    /*
     * Checks to see if balance is sufficient for withdrawal
     * if so, decrements balance by amount; if not, prints message
     */
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
    
        }
    }
    
    /*
     * adds deposit to balance.
     */
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    /*
     * returns balance
     */
    
    public double getBalance()
    {
        return balance;
    }
    
    /*
     * returns a string containing the name, account number, and balance
     */
    
    public String toString()
    {
        return name + " " + acctNum + " " + fmt.format(balance);
    }
    
    /*
     * deducts $10 service fee
     */
    
    public double chargeFee()
    {
        balance -= 10;
        return balance;
    }
    
    /*
     * changes the name on the account
     */
    
    public void changeName(String newName)
    {
        name = newName;
    }
}
