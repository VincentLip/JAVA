package org.example.matrice;

public class Matrice1 {

    public static void matrice1(){

        int[][] mat = {
                {45,23,34,56,30},
                {67,75,21,52,59},
                {89,34,19,19,15},
                {1,78,90,48,42}
        };

        int max =0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(max < mat[i][j])
                    max = mat[i][j];
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("La valeur la plus élevée de cette matrice est : "+ max);
    }
}
