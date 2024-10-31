package com.elifcan;

import java.util.Scanner;

public class Runner_Problem18 {

    public static void main(String[] args) {
        /**
         * Bir dizi oluşturun ve dizideki elemanları küçükten büyüğe sıralayan bir program yazın.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: "); // dizinin genişliğini belirlemek için sayı talep ediliyor.
        int x = sc.nextInt();


        int [] sayiDizisi= new int[x]; // dizinin genişliği x kada olacaktır.
        int [] yeniDizi = new int [x]; // küçükten büyüüe sıralanacak olan yeni bir dizi oluşturuldu.

        for ( int i = 0 ; i < x ; i++) {
            System.out.println(i + 1 + ". sayı: ");
            sayiDizisi[i] = sc.nextInt(); // dizinin içindeki elemanlar talep ediliyor.
        }
        int enKucuk = sayiDizisi[0];

        for ( int i = 1 ; i < x ; i++) {   // dizinin içindeki en küçük eleman tespit ediliyor.
            if (enKucuk > sayiDizisi[i]) {
                enKucuk = sayiDizisi[i];
            }
        }yeniDizi[0] = enKucuk;

        System.out.println("Dizideki en küçük sayi: " + enKucuk);








    }

}
