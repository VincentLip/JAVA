package org.example.matrice;

public class Exo2 {

    public static void testLine(){

        int[][] mat = {
                {45,23,34,56,30},
                {67,75,21,59},
                {89,34,19,19,15},
                {1,78,90,48,42}
        };
        boolean check = true ;
        int line = mat[0].length;

        for (int i = 0; i <mat.length; i++) {
            if (line != mat[i].length) {
                check = false;
            }
        }
        if(check == true){

            System.out.println("Le tableau est régulier");
        }else{
            System.out.println("Le tableau n'est pas régulier");
        }

    }
}
