package com.elifcan;

import java.util.Scanner;

public class Runner_Problem4 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir cümle alın ve cümlenin karakter
         * sayısını ekrana yazdıran bir program yazın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen karakter sayısını girmek istediğini cümleyi giriniz: ");
        String cumle = sc.nextLine();

        System.out.println("Cümlenin içindeki karakter sayisi: " + cumle.length());

        String cumleBosluksuz = cumle.replace(" ","");
        System.out.println("Boşluksuz karakter sayisi: " + cumleBosluksuz.length());
    }
}
