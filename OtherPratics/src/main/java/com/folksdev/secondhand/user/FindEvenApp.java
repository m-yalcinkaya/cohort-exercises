package com.folksdev.secondhand.user;

import java.util.Scanner;

public class FindEvenApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Sayi: ");
        int sayi = scanner.nextInt();

        int toplam =0;
        int sayac=0;

        System.out.print("Çift Sayilar: ");
        for(int i=0; i<=sayi; i++){
            if(i%2==0) System.out.print(i + " ");
            if(i%3==0 && i%4==0){
                sayac++;
                toplam += i;
            }
        }

        double ortalama = (double) toplam / sayac;

        System.out.println("\nOrtalama: " + ortalama);

    }
}
