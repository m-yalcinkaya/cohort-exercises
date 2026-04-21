package com.folksdev.secondhand.user;

import java.util.Scanner;

public class HarmonicApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Sayi: ");
        double toplam=0, sayi = scanner.nextInt();

        for(int i = 1; i<=sayi; i++){
            toplam+= ((double) 1 /i);
        }

        System.out.println("Harmonik toplam: " + toplam);
    }
}
