package org.example.employe;

public class Main {

    public static void main() {
        Employe employe=new Employe("Jean",45,2200);
        Technicien technicien =new Technicien("Paul",32,2000,2);

        System.out.println("Avant augmentation:");
        employe.afficher();
        technicien.afficher();

        employe.augmentation(200);
        technicien.augmentation(200);

        System.out.println("Apres augmentation:");
        employe.afficher();
        technicien.afficher();




    }
}
