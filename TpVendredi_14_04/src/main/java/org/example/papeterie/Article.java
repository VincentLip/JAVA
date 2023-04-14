package org.example.papeterie;

public abstract class Article {

    private String reference;

    public Article(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    public abstract String getDescriptif();

    public abstract double getPU();


    public String getMarque() {
        return "Sans marque";
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ":reference="
                + reference + ";descriptif=" + getDescriptif()
                + ";marque=" + getMarque() + ";PU=" + getPU();
    }
}
