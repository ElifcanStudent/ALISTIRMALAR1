package com.elifcan;

import java.util.Scanner;

public class Runner_Problem19 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir dizi alın ve dizide tekrar eden elemanları bulun.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: "); // dizinin genişliğini belirlemek için sayı talep ediliyor.
        int x = sc.nextInt();

        int [] sayiDizisi= new int[x]; // dizinin genişliği x kadar olacaktır.
        int [] tekrar = new int [x]; // tekrar eden sayılar için dizi

        for ( int i = 0 ; i < x ; i++) {
            System.out.println(i + 1 + ". sayı: ");
            sayiDizisi[i] = sc.nextInt(); // dizinin içindeki elemanlar talep ediliyor.
        }

        int index = 0;

        for (int i = 0 ; i < sayiDizisi.length ; i++) {
            for (int j = 0 ; j < sayiDizisi.length ; j++) {
                if ((i != j) && (sayiDizisi[i] == sayiDizisi[j])) {
                    tekrar[index++] = sayiDizisi[i];
                }
            }
        }

    }
}
