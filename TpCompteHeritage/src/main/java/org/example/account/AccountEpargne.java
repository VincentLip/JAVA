package org.example.account;

public class AccountEpargne extends Account{


    private double tauxinteret=2;

    public AccountEpargne(int solde, double tauxinteret) {
        super(solde);
        this.tauxinteret = tauxinteret;
    }

    public void CalculerInteret()
    {
        verser((solde * tauxinteret)/ 100);
    }

    @Override
    public String toString() {
        return "AccountEpargne{" +
                "tauxinteret=" + tauxinteret +
                ", solde=" + solde +
                '}';
    }
}
