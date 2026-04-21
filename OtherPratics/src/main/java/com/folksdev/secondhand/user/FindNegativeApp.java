package com.folksdev.secondhand.user;

import java.util.Scanner;

public class FindNegativeApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("App1 -> Değer giriniz: ");
        int sayi, sayi2, toplam=0, toplam2=0;

        do{
            sayi = scanner.nextInt();
            if(sayi%2==1) toplam+=sayi;
        }while(sayi>0);

        System.out.println("\nPozitif sayıların toplamı: " + toplam);

        System.out.print("App2 -> Değer giriniz: ");

        do{
            sayi2 = scanner.nextInt();
            if(sayi2%4==0) toplam2+=sayi2;
        }while(sayi2%2==0);

        System.out.println("iki ile 4'e bölünen sayiların toplami: " + toplam2);


    }
}
