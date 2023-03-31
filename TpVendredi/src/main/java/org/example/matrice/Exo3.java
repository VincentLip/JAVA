package org.example.matrice;

public class Exo3 {


        static int[][] mat1 = {
                {1,2,3,4},
                {5,6,7,8},

        };
        static int[][] mat2 = {
                {1,2,3,4},
                {5,6,7,8},

        };

    public static boolean regular(int tab[][]) {

        boolean check = true;
        int line = tab[0].length;

        for (int i = 1; i < tab.length; i++)
            if (line != tab[i].length)
                return false;
        return true;

    }

    public static void main() {

        int sum1 =0;
        int sum2=0;


        if (regular(mat1) & regular(mat2)) {
            if (mat1.length == mat2.length) {
                for (int i = 0; i < mat1.length; i++) {
                    for (int j = 0; j < mat1[i].length; j++) {
                        sum1 += mat1[i][j];
                    }
                }
                for (int i = 0; i < mat2.length; i++) {
                    for (int j = 0; j < mat2[i].length; j++) {
                        sum1 += mat2[i][j];
                    }
                }
                System.out.println("Ils sont identiques et la somme des 2 matrices est de " + (sum1+sum2));

            } else {
                System.out.println("Ils ne sont pas identiques");
            }

        }else {
            System.out.println("Ils ne sont pas identiques");
        }
    }

}
