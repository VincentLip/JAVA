package org.example.papeterie;

public class Ligne {

    private Article article;
    private int quantite;

    Ligne(Article article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    Article getArticle() {
        return article;
    }

    int getQuantite() {
        return quantite;
    }


    void afficheLigne() {
        System.out.println(" Quantité : " + quantite +
                " Référence : " + article.getReference()+
                " Description : " + article.getDescriptif()+
                " Marque : " + article.getMarque()+
                " Prix Unitaire : " + article.getPU()+
                " Prix Total : " + prixTotal());
    }

    double prixTotal() {
        return article.getPU() * quantite;
    }

    @Override
    public String toString() {
        return quantite + " " + article;
    }
}
