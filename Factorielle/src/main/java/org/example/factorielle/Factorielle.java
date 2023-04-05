package org.example.factorielle;

public class Factorielle {

    public static int fact(int a){

        if(a == 0){
            return 1;
        }else{
            return a * fact(a-1);
        }
    }
}
