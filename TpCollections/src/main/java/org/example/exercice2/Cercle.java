package org.example.exercice2;

import java.util.Comparator;

public class Cercle {

    private Integer x;
    private Integer y;
    Integer rayon;

    public Cercle(int x, int y, int rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public int getX() {
        return x;
    }

    public double getRayon() {
        return rayon;
    }

    public void affiche(){
        System.out.println("Coordonnées : " + x + ", "+ y + "; rayon  : " + rayon);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "x=" + x +
                ", y=" + y +
                ", rayon=" + rayon +
                '}';
    }

    public static Comparator<Cercle> rayonComparator = new Comparator<Cercle>() {
        @Override
        public int compare(Cercle o1, Cercle o2) {
            return o1.rayon.compareTo(o2.rayon);
        }
    };

    public static Comparator<Cercle> cComparator = new Comparator<Cercle>() {
        @Override
        public int compare(Cercle o1, Cercle o2) {
            return o1.x.compareTo(o2.x);
        }
    };
}
