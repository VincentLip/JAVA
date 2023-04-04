package org.example.account;

public class Account {

    private static int counter =0;

    protected int solde;
    protected int code;

    {
        ++counter;
    }
    public Account(int solde) {
        this.solde = solde;
        this.code = counter;
    }

    public void verser(double mnt){
        solde += mnt;
    }
    public void retrait(double mnt){
        solde -= mnt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "solde=" + solde +
                ", code=" + code +
                '}';
    }
}
