package com.elifcan;

import java.util.Scanner;

public class Runner_Problem10 {

    public static void main (String [] args){

        /**
         * Kullanıcıdan bir ay ismi alın ve o ayın kaç gün çektiğini ekrana
         * yazdıran bir program yazın (şubat için 28 varsayılabilir).
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                ***************************************
                1- OCAK
                2- SUBAT
                3- MART
                4- NİSAN
                5- MAYIS
                6- HAZİRAN
                7- TEMMUZ
                8- AĞUSTOS
                9- EYLÜL
                10- EKİM
                11- KASIM
                12- ARALIK
                ***************************************
                LUTFEN GUNUNU OGRENMEK ISTEDIGINIZ AYIN NUMARASINI GIRINIZ: 
                """);

        String giris = sc.nextLine();
        String ay = giris.toUpperCase();

        switch(ay){
            case "OCAK":
                System.out.println("OCAK AYI 31 GUNDUR.");
                break;
            case "SUBAT":
                System.out.println("SUBAT AYI 28 GUNDUR.");
                break;
            case "MART":
                System.out.println("MART AYI 30 GUNDUR.");
                break;
            case "NISAN":
                System.out.println("NISAN AYI 31 GUNDUR.");
                break;
            case "MAYIS":
                System.out.println("MAYIS AYI 31 GUNDUR.");
                break;
            case "HAZIRAN":
                System.out.println("HAZIRAN AYI 30 GUNDUR.");
                break;
            case "TEMMUZ":
                System.out.println("TEMMUZ AYI 31 GUNDUR.");
                break;
            case "AGUSTOS":
                System.out.println("AGUSTOS AYI 31 GUNDUR.");
                break;
            case "EYLUL":
                System.out.println("EYLUL AYI 30 GUNDUR.");
                break;
            case "EKIM":
                System.out.println("EKIM AYI 31 GUNDUR.");
                break;
            case "KASIM":
                System.out.println("KASIM AYI 30 GUNDUR.");
                break;
            case "ARALIK":
                System.out.println("ARALIK AYI 31 GUNDUR.");
                break;
            default:
                System.out.println("GECERSIZ GIRIS.");
        }
    }
}
