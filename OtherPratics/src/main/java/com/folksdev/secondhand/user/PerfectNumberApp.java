package com.folksdev.secondhand.user;

import java.util.Scanner;

public class PerfectNumberApp {
    public class PerfectNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Bir sayı giriniz: ");
            int sayi = scanner.nextInt();

            int toplam = 0;

            if (sayi <= 0) {
                System.out.println(sayi + " Mükemmel sayı değildir.");
                return;
            }

            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == sayi) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }

    }
}
