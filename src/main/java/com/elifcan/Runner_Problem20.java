package com.elifcan;

import java.util.Scanner;

public class Runner_Problem20 {
    public static void main(String[] args) {

        /**
         * 10 elemanlı bir dizide yalnızca çift sayıları ekrana yazdıran bir program yazın.
         */
        Scanner sc = new Scanner(System.in);

        int [] onDizisi = new int[10];

        for ( int i = 0 ; i < onDizisi.length ; i++) {
            System.out.println(i + 1 + ". sayı: ");
            onDizisi[i] = sc.nextInt(); // dizinin içindeki elemanlar talep ediliyor.
        }
        for (int i = 0; i < onDizisi.length ; i++) {
            if (onDizisi[i] % 2 == 0) {
                System.out.println(onDizisi[i]);
            }
        }

    }
}
