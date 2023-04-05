package org.example;

import org.example.factorielle.Factorielle;
import org.example.factorielle.Multi;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println(Factorielle.fact(8));
        System.out.println();
        Multi.multi(5,10);
    }
}
