package org.example.chaise;

public class Chaise {

    private int NbPieds;
    private String Couleur;
    private String Materiaux;

    public Chaise(int nbPieds, String couleur, String materiaux) {
        NbPieds = nbPieds;
        Couleur = couleur;
        Materiaux = materiaux;
    }

    public Chaise() {
    }

    @Override
    public String toString() {
        return "Je suis une chaise , avec " + NbPieds +
                " pieds en " + Materiaux +
                " et de couleur " + Couleur;
    }
}
