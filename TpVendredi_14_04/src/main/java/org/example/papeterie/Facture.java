package org.example.papeterie;

public class Facture {

    private static int NB_MAX_LIGNES = 10;
    private static int numeroCourant = 0;
    private String client;
    private String  date;
    private Ligne[] lignes;

    private int nbLignes = 0;

    private int numero = 0;

    public Facture(String client, String date, Ligne[] lignes, int nbLignes, int numero) {
        this.client = client;
        this.date = date;
        this.lignes = lignes;
        this.nbLignes = nbLignes;
        this.numero = numero;
    }

    public void ajouterLigne(Article article, int quantite) {
        lignes[nbLignes++] = new Ligne(article, quantite);
    }

    public double getPrixTotal() {
        double result = 0;
        for (int i = 0; i < nbLignes; i++) {
            result += lignes[i].prixTotal();
        }
        return result;
    }
}
