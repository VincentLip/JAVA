package org.example.salarie;

public class Salarie {

    public int Matricule;
    public String Categorie;
    public String Service;
    public String Nom;
    public int Salaire;


    public static int count=0;


    public Salarie(String nom, int salaire) {
        Nom = nom;
        Salaire = salaire;
        ++count;
    }

    public int getMatricule() {
        return Matricule;
    }

    public void setMatricule(int matricule) {
        Matricule = matricule;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String categorie) {
        Categorie = categorie;
    }

    public String getService() {
        return Service;
    }

    public void setService(String service) {
        Service = service;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getSalaire() {
        return Salaire;
    }

    public void setSalaire(int salaire) {
        Salaire = salaire;
    }

    public int CalculerSalaire(){

        return getSalaire();
    }

    public Salarie(int matricule, String categorie, String service, String nom, int salaire) {
        Matricule = matricule;
        Categorie = categorie;
        Service = service;
        Nom = nom;
        Salaire = salaire;
    }

    public void AfficherSalaire(){

        System.out.println("Le salaire de " + Nom + " est de " + Salaire);
    }

    public void resetCount(){

        count = 0;
    }
}
