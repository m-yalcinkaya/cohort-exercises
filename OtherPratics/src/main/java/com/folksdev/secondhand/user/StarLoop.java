package com.folksdev.secondhand.user;

import java.util.Scanner;

public class StarLoop {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayı giriniz (Elmasın büyüklüğü): ");
        int n = klavye.nextInt();

        // 1. Üst Kısım (Piramit)
        for (int i = 1; i <= n; i++) {
            // Boşluklar için
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar için (2n-1 kuralı: 1, 3, 5, 7...)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Alt Kısım (Ters Piramit)
        for (int i = n - 1; i >= 1; i--) {
            // Boşluklar için
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Yıldızlar için
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
