package com.elifcan;

import java.util.Scanner;

public class Runner_Problem9 {

    public static void main (String[] args) {

        /**
         * Kullanıcıdan üç sayı alın ve en büyüğünü ekrana yazdırın.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen 3 adet sayı giriniz: ");
        System.out.println("1. Sayı: ");
        int sayi1 = sc.nextInt();
        System.out.println("2. Sayı: ");
        int sayi2 = sc.nextInt();
        System.out.println("3. Sayı: ");
        int sayi3 = sc.nextInt();

        int enBuyuk = sayi1;

        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
            if (enBuyuk < sayi3) {
                enBuyuk = sayi3;
            }
            System.out.println("En büyük sayi: " + enBuyuk);
        }
        else
            System.out.println("En büyük sayi: " + enBuyuk);
    }
}
