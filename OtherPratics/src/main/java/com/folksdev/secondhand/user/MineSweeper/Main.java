package com.folksdev.secondhand.user.MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row, col;

        System.out.println("--- Mayın Tarlası Ayarları ---");

        while (true) {
            System.out.print("Satır Sayısı : ");
            row = scan.nextInt();
            System.out.print("Sütun Sayısı : ");
            col = scan.nextInt();

            if (row >= 2 && col >= 2) {
                break;
            } else {
                System.out.println("Hata: Matris boyutu en az 2x2 olmalıdır. Lütfen tekrar giriniz.");
            }
        }

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
