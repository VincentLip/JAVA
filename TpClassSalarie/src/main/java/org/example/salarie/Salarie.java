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

    public void AfficherSalaire(){

        System.out.println("Le salaire de " + Nom + " est de " + Salaire);
    }

    public void resetCount(){

        count = 0;
    }
}
