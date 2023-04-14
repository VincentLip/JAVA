package org.example.papeterie;

public abstract class ArticleUnitaire extends Article{

    private String marque;
    private double prixUnit;
    private String descriptif;

    public ArticleUnitaire(String reference) {
        super(reference);
    }

    public ArticleUnitaire(String reference, String marque, double prixUnit, String descriptif) {
        super(reference);
        this.marque = marque;
        this.prixUnit = prixUnit;
        this.descriptif = descriptif;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrixUnit() {
        return prixUnit;
    }

    public void setPrixUnit(double prixUnit) {
        this.prixUnit = prixUnit;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    @Override
    public String toString() {
        return "ArticleUnitaire{" +
                "marque='" + marque + '\'' +
                ", prixUnit=" + prixUnit +
                ", descriptif='" + descriptif + '\'' +
                '}';
    }
}
