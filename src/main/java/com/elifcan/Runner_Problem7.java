package com.elifcan;

import java.util.Scanner;

public class Runner_Problem7 {

    public static void main (String[] args) {
        /**
         * Bir öğrencinin notunu (0-100 arası) kullanıcıdan alın ve
         * 50’den büyükse “Geçti”, küçükse “Kaldı” şeklinde sonuç yazdırın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz: ");
        int not = sc.nextInt();
        if (not < 50){
            System.out.println("KALDI");
        }
        else if (not > 50){
            System.out.println("GECTI");
        }

    }

}
