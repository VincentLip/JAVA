package org.example.matrice;

public class Matrice2 {

    public static void matrice2(){

        int mat [][] = new int[4][5];
        int count = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]= count;
                count++;
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
