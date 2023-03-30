package org.example.array;

public class exo2 {

    public static void sortTab(){

        int[] tab = {1,2,3,4,1};
        int count=0;
        boolean sort = true;

        for (int i = 0; i < tab.length-1; i++) {
            if(tab[i] > tab[i+1]){
              sort =false;
            }
        }
        if(sort){
            System.out.println("Le tableau est trié");
        }else{
            System.out.println("Le tableau n'est pas trié");
        }

    }
}
