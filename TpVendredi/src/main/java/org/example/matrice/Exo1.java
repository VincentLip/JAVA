package org.example.matrice;

public class Exo1 {

    public static void sumDiagMatrice(){

        int[][] mat = new int[5][5];
        int sum =0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(i==j){
                    sum = sum + mat[i][j];
                }
            }
        }
    }
}
