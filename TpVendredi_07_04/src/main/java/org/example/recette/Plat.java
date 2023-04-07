package org.example.recette;

import jdk.jfr.internal.PlatformRecorder;

import java.util.ArrayList;

public class Plat {

    String nom;
    ArrayList<Ingredient> ingredients;

    public Plat(String nom, ArrayList<Ingredient> ingredients) {
        this.nom = nom;
        this.ingredients = ingredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void main(){

        Ingredient choucrouteCuite = new Ingredient("chouroute","cuite",500,"g");
        Ingredient lard = new Ingredient("lard","cuit",150,"g");
        Ingredient saucisses = new Ingredient("saucisse","entière",2," ");

        ingredients.add(choucrouteCuite);
        ingredients.add(lard);
        ingredients.add(saucisses);

        Plat plat = new Plat("Choucroute",ingredients);
    }


}
