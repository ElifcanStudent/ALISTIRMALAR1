package com.elifcan;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan iki tamsayı alın ve bu sayıların toplamını, farkını, çarpımını
         * ve bölümünü ekrana yazdıran bir program yazın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("İşlem yapmak istediğiniz 1. sayıyı giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("İşlem yapmak istediğiniz 2. sayıyı giriniz: ");
        int sayi2 = sc.nextInt();
        System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
        System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
        System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
        System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));

        }
    }
