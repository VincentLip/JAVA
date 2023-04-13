package org.example.exercice1;

import java.util.*;

public class Exercice1 {
    static ArrayList<Integer> tab = new ArrayList<Integer>();

    public static void main() {
        tab.add(5);
        tab.add(-1);
        tab.add(3);
        tab.add(2);
        tab.add(4);
        System.out.println(tab);


        System.out.println("----- Ordre croissant -----");
        Collections.sort(tab);
        System.out.println(tab);

        for (int i = 1; i < tab.size(); i++) {
            if(tab.get(i-1)>tab.get(i)){
                int tmp = tab.get(i-1);
                tab.set(i-1,tab.get(i));
                tab.set(i,tmp);
            }
        }
        System.out.println(tab);

        Collections.sort(tab, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(tab);


        System.out.println("----- Ordre inverse -----");

        Collections.reverse(tab);
        System.out.println(tab);

        for (int i = 0; i < tab.size()/2; i++) {
                int tmp = tab.get(i);
                tab.set(i,tab.get(tab.size()-1-i));
                tab.set(tab.size()-i-1,tmp);

        }
        System.out.println(tab);

        System.out.println("----- Rang pair -----");

        for (int i = 0; i < tab.size(); i+=2) {
                System.out.println(tab.get(i));
        }



        System.out.println("----- Remise à zero négatif -----");

        for (int i = 0; i < tab.size(); i++) {
            if(tab.get(i) < 0){
                tab.set(i,0);
            }

        }
        System.out.println(tab);

    }

}



