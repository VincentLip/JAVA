package org.example.salarie;

public class Commerciale extends Salarie{

    protected int chiffreAffaire;
    protected int commision;

    public Commerciale(int matricule, String categorie, String service, String nom, int salaire) {
        super(matricule, categorie, service, nom, salaire);
    }

    public Commerciale(int matricule, String categorie, String service, String nom, int salaire, int chiffreAffaire, int commision) {
        super(matricule, categorie, service, nom, salaire);
        this.chiffreAffaire = chiffreAffaire;
        this.commision = commision;
    }

    public int getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(int chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public int getCommision() {
        return commision;
    }

    public void setCommision(int commision) {
        this.commision = commision;
    }

    @Override
    public int CalculerSalaire() {
        return getSalaire()+commision;
    }
}
