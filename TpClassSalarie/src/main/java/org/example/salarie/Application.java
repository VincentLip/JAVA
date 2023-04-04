package org.example.salarie;

public class Application extends Salarie {

    public static int sum;

    public Application(String nom, int salaire, int sum) {
        super(nom, salaire);
        this.sum = sum;
    }

    public static void main() {

        Salarie salarie1 = new Salarie("toto",2000);
        Salarie salarie2 = new Salarie("titi",2300);
        System.out.println("Le nombre de salariés : " + count);
        sum += salarie1.Salaire + salarie2.Salaire;
        salarie1.AfficherSalaire();
        salarie2.AfficherSalaire();
        System.out.println("Le montant total des salaires mensuel est de " + sum);
        System.out.println();
        salarie1.resetCount();
        System.out.println("Le nombre de salariés : " + count);

    }


}
