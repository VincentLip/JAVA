package org.example.factorielle;

public class Multi {

    public static int multi(int a, int b){

        System.out.println(a + " * " + b + " = " + a*b);
        if(b == 0){
            return 0;
        }else{
            return a * multi(a,b-1);
        }
    }
}
