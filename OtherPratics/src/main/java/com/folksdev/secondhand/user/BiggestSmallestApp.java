package com.folksdev.secondhand.user;

import java.util.Scanner;

public class BiggestSmallestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Geçersiz sayı adedi.");
            return;
        }

        int enBuyuk = 0;
        int enKucuk = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (i == 1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            } else {
                if (sayi > enBuyuk) {
                    enBuyuk = sayi;
                }
                if (sayi < enKucuk) {
                    enKucuk = sayi;
                }
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }

}
