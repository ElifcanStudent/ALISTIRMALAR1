package com.elifcan;

import java.util.Scanner;

public class Runner_Problem12 {

    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Lutfen faktoriyelin hesaplanması istenilen sayıyı giriniz: ");

        int sayi = sc.nextInt();
        int faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {

            faktoriyel *= i;

        }
        System.out.println(sayi + " faktoriyel: " + faktoriyel);



    }
}
