package com.elifcan;

import java.util.Scanner;

public class Runner_Problem13 {

    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir sayı alın ve bu sayının asal olup olmadığını kontrol
         * eden bir program yazın.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int asal = sc.nextInt();
        boolean asalMi = true;

        for (int i = 2 ; i < asal ; i++ ) {
            if (asal % i == 0) {

                asalMi = false;
                System.out.println(asal + " asal sayı değildir.");
                break;
            }
        }
        if (asalMi == true) {
            System.out.println(asal + " asal sayıdır.");
        }
    }
}
