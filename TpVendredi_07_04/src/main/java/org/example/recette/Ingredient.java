package org.example.recette;

public class Ingredient {

    static String nomAliment;
    String etat;
    int quantite;
    String unite;

    Ingredient(String n, String e, int q, String unite) {
        this.nomAliment = n;
        this.etat = e;
        this.quantite = q;
        this.unite = unite;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Ingredient && o.equals(nomAliment) && o.equals(etat);

    }

}
