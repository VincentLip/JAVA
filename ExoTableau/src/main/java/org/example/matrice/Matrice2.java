package org.example.matrice;

public class Matrice2 {

    public static void matrice2(){

        int[][] mat ;
        mat = new int[4][5];
        int count = 1;
        int sum = 0;
        int multiplication=1;


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]= count;
                count++;
                sum += mat[i][j];
                multiplication *= mat[i][j];
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("La somme des valeurs de la matrice est de " + sum);
        System.out.println("La multiplication des valeurs de la matrice est de " + multiplication);
    }
}
