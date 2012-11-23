/*
 * ManageAccounts.java 
 * 
 * Use account class to create and manage Sally and Joe's bank accounts
 */
package account;

import java.text.NumberFormat;

public class ManageAccounts 
{
    public static void main(String[] args)
    {
        NumberFormat fmt =NumberFormat.getCurrencyInstance();
        
        Account acct1, acct2;
        
        //create account1 for sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        
        //create account2 for Joe with $500
        acct2 = new Account(500, "Joe", 1112);
        
        //deposit $100 to Joe's account
        acct2.deposit(100);
        
        //print Joe's new balance
        double JoeBalance = acct2.getBalance();
        System.out.println("Joe's balance is " + fmt.format(JoeBalance));
        //withdraw $50 from Sally's account
        acct1.withdraw(50);
        
        //print Sally's new balance
        double SallyBalance = acct1.getBalance();
        System.out.println("Sally's Balance is " + fmt.format(SallyBalance));
        
        //charge fees to both accounts
        acct1.chargeFee();
        acct2.chargeFee();
        
        //change the name on Joe's account to Joseph
        acct2.changeName("Joseph");
        
        //print summary for both accounts
        System.out.println(acct1);
        System.out.println(acct2);
    }
}
