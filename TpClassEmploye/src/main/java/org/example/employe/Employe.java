package org.example.employe;

public class Employe {

    private String nom;
    private int age;
    private int salaire;

    public Employe() {
    }

    public Employe(String nom, int age, int salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
    }

    public void augmentation(int mnt){

        salaire+=mnt;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public void afficher(){

        System.out.println("Le salarié "+ nom + " a un salaire de " + salaire);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", salaire=" + salaire +
                '}';
    }
}
