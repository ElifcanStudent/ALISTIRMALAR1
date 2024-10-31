package com.elifcan;

import java.util.Scanner;

public class Runner_Problem6 {
    public static void  main (String [] args) {
        /**
         * Kullanıcıdan bir tamsayı alın ve bu sayının çift mi,
         * tek mi olduğunu belirleyin.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int tamSayi = sc.nextInt();
        if (tamSayi % 2 == 0) {
            System.out.println(tamSayi + " bir çift sayidir.");
        }
        else {
            System.out.println(tamSayi + " bir tek sayidir.");
        }
    }
}
