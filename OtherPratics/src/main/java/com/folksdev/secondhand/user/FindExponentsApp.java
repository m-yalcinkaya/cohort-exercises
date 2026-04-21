package com.folksdev.secondhand.user;

import java.util.Scanner;

public class FindExponentsApp {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Üssü alınacak sayi: ");
        int sayi = scanner.nextInt();

        System.out.print("\nSayinin üssü: ");
        int us = scanner.nextInt();
        int carpim = 1;
        for(int i=0; i<us; i++){
            carpim*=sayi;
        }

        System.out.println("Sonuc: " + carpim);
    }
}
