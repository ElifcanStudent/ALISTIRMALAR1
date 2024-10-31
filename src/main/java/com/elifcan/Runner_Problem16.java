package com.elifcan;

import java.util.Scanner;

public class Runner_Problem16 {

    public static void main(String[] args) {

        /**
         * 5 elemanlı bir dizi oluşturun, kullanıcıdan elemanları alın
         * ve bu dizinin ortalamasını hesaplayın.
         */

        Scanner sc = new Scanner(System.in);

        int [] sayiDizisi = new int[5];

        System.out.println("Lütfen 5 tane sayı giriniz.");

        for ( int i = 0 ; i < 5 ; i++){
            System.out.println(i+1 + ". sayı: ");
            sayiDizisi[i] = sc.nextInt();
        }
        int toplam = sayiDizisi[0];
        for (int i = 1 ; i < 5 ; i++){
            toplam += sayiDizisi[i];
        }
        System.out.println("Ortalama : " + toplam/5);


    }
}
