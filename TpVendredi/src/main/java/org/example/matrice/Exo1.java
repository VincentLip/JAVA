package org.example.matrice;

public class Exo1 {

    public static void sumDiagMatrice(){

        int[][] mat = {
                {45,23,34,56,30},
                {67,75,21,52,59},
                {89,34,19,19,15},
                {1,78,90,48,42}
        };
        int sum =0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j){
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.println("La somme de la diagonale est de " + sum);
    }
}
