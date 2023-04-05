package org.example.enums;

import java.util.Objects;
import java.util.Scanner;

public class DemoEnum {


    public static void main() {

        String msg;
        System.out.println("Veuillez saisir A,B,C ou D");
        Scanner sc = new Scanner(System.in);
        msg = sc.nextLine();

        while(!msg.equals("A")  && !msg.equals("B")&& !msg.equals("C")&& !msg.equals("D")){
            System.out.println("Message invalide");
            System.out.println("Veuillez saisir A,B,C ou D");
            Scanner sc1 = new Scanner(System.in);
            msg = sc1.nextLine();
        }

        switch (msg){
            case "A" :
                System.out.println(Priority.A.getMsg());
                break;
            case "B" :
                System.out.println(Priority.B.getMsg());
                break;
            case "C" :
                System.out.println(Priority.C.getMsg());
                break;
            case "D" :
                System.out.println(Priority.D.getMsg());
                break;
        }

    }
}
