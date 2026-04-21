package com.folksdev.secondhand.user;

import java.util.Scanner;

public class EbobEkokApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = scanner.nextInt();

        // Sayıların orijinallerini saklıyoruz çünkü n1 ve n2 döngüde değişecek
        int sayi1 = n1;
        int sayi2 = n2;

        // 1. EBOB Hesaplama (Öklid Algoritması ile)
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }

        int ebob = n1;

        // 2. EKOK Hesaplama
        // Formül: (Sayı1 * Sayı2) / EBOB
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("----------------------------");
        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
