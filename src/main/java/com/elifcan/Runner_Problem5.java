package com.elifcan;

import java.util.Scanner;

public class Runner_Problem5 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir ürünün fiyatını alın ve %18 KDV
         * eklenmiş halini ekrana yazdıran bir program yazın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ürün fiyatını giriniz: ");
        double fiyat = sc.nextDouble();
        System.out.println("KDV'li fiyat: " + fiyat*1.18);

    }
}
