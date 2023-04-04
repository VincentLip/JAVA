package org.example.account;

public class AccountSimple extends Account{


    private int decouvert;


    public AccountSimple(int solde, int decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public String toString() {
        return "AccountSimple{" +
                "decouvert=" + decouvert +
                '}';
    }
}
