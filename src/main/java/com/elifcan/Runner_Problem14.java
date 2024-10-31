package com.elifcan;

import java.util.Scanner;

public class Runner_Problem14 {

    public static void main(String[] args) {

        /**
         * Kullanıcıdan bir sayı alın ve bu sayıya kadar olan çift sayıları
         * ekrana yazdıran bir program yazın.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = sc.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (i % 2 == 0) {
                System.out.println(i);

            }

        }

    }
}
