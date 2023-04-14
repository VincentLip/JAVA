package org.example.papeterie;

public class Stylo extends ArticleUnitaire{

    private String couleur;

    public Stylo(String reference, String couleur) {
        super(reference);
        this.couleur = couleur;
    }

    public Stylo(String reference, String marque, double prixUnit, String descriptif, String couleur) {
        super(reference, marque, prixUnit, descriptif);
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public double getPU() {
        return 0;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "couleur='" + couleur + '\'' +
                '}';
    }
}
