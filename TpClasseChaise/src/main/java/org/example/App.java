package org.example;

import org.example.chaise.Chaise;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Chaise chaise1 = new Chaise(4,"bleu","bois");
        Chaise chaise2 = new Chaise(4,"blanche","metal");
        Chaise chaise3 = new Chaise();
        Chaise chaise4 = new Chaise(1,"transparente","pléxiglass");

        System.out.println(chaise1);
        System.out.println(chaise2);
        System.out.println(chaise3);
        System.out.println(chaise4);
    }
}
