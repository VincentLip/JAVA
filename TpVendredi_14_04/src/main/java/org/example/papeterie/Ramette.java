package org.example.papeterie;

public class Ramette extends ArticleUnitaire{

    private int grammage;

    public Ramette(String reference, String marque, double prixUnit, String descriptif, int grammage) {
        super(reference, marque, prixUnit, descriptif);
        this.grammage = grammage;
    }

    public int getGrammage() {
        return grammage;
    }

    @Override
    public double getPU() {
        return 0;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "grammage=" + grammage +
                '}';
    }
}

