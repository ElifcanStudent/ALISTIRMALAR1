package com.elifcan;

import java.util.Scanner;

public class Runner_Problem8 {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan doğum yılını alın ve 18 yaşından büyük olup olmadığını kontrol edin.
         * Büyükse "Reşit", değilse "Reşit değil" yazdırın.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen doğum yılınızı giriniz: ");
        int dogumYili = sc.nextInt();
        int yas = 2024-dogumYili;
        if (yas < 18)
            System.out.println("RESIT DEGIL");
        else
            System.out.println("RESIT");
    }
}
