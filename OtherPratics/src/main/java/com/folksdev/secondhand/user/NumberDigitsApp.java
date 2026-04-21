package com.folksdev.secondhand.user;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberDigitsApp{

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Sayi: ");
        int sayi = scanner.nextInt();
        int basamak, toplam = 0;

        while(true){
            basamak = sayi%10;
            System.out.print(basamak + " ");
           toplam += basamak;
           if(sayi<10) break;
           sayi/=10;
        }

        System.out.println("= " + toplam);

    }
}
