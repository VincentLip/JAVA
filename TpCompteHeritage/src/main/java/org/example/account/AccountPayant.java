package org.example.account;

public class AccountPayant extends Account {

    public AccountPayant(int solde) {
        super(solde);
    }

    @Override
    public void verser(double mnt)
    {
        solde += mnt;
        solde -= ((mnt*5)/100);
    }
    @Override
    public void retrait(double mnt)
    {
        solde -= mnt;
        solde -= ((mnt*5)/100);
    }

}
