package org.example;

import org.example.account.Account;
import org.example.account.AccountEpargne;
import org.example.account.AccountPayant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Account account1 = new Account(2000);
        System.out.println(account1);
        account1.verser(200);
        System.out.println(account1);
        account1.retrait(500);
        System.out.println(account1);

        AccountEpargne accountEpargne = new AccountEpargne(1000,5);
        System.out.println(accountEpargne);
        accountEpargne.CalculerInteret();
        System.out.println(accountEpargne);

        AccountPayant accountPayant = new AccountPayant(1000);
        System.out.println(accountPayant);
        accountPayant.verser(100);
        System.out.println(accountPayant);
        accountPayant.retrait(100);
        System.out.println(accountPayant);
    }
}
