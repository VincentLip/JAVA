package org.example.papeterie;

public class Lot extends Article{

    private Article article;
    private int nb;
    private int pourcentage;

    public Lot(String reference, Article article, int nb, int pourcentage) {
        super(reference);
        this.article = article;
        this.nb = nb;
        this.pourcentage = pourcentage;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getDescriptif() {
        return "Lot de " + nb + " *" + article.getDescriptif() + "* ";
    }

    public double getPU() {
        return nb * article.getPU() * (100 - pourcentage) / 100;
    }

    @Override
    public String getMarque() {
        return article.getMarque();
    }

    @Override
    public String toString() {
        return "Lot{" +
                "article=" + article +
                ", nb=" + nb +
                ", pourcentage=" + pourcentage +
                '}';
    }
}
