package com.elifcan;

import java.util.Scanner;

public class Runner_Problem2 {
    public static void main(String[] args) {
        /**
         * Bir öğrencinin sınav notlarını (vize ve final) kullanıcıdan alın,
         * vize %40, final %60 etkili olacak şekilde ortalamayı hesaplayın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Vize notunu giriniz: ");
        float vizeNotu = sc.nextInt();
        System.out.println("Final notunu giriniz: ");
        float finalNotu = sc.nextFloat();
        float ortalama;
        ortalama = (float) ((vizeNotu*0.4) + (finalNotu*0.6));
        System.out.println("Öğrencinin ortalaması: " + ortalama);
    }
}
