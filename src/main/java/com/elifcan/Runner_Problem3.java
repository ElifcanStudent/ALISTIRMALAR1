package com.elifcan;

import java.util.Scanner;

public class Runner_Problem3 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan yarıçapı alınan bir dairenin alanını ve çevresini
         * hesaplayan bir program yazın (alan = π * r^2, çevre = 2 * π * r).
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen dairenin yarıçapını cm cinsinden giriniz: ");
        int yariCap = sc.nextInt();

        float pi ;
        pi = 3.14159F;

        float alan = pi * yariCap * yariCap; // Alan hesabı
        System.out.println("Dairenin Alanı : " + alan + " cm^2");

        float cevre = 2 * pi * yariCap; // Çevre hesabı
        System.out.println("Dairenin Cevre : " + cevre + " cm");




    }
}
