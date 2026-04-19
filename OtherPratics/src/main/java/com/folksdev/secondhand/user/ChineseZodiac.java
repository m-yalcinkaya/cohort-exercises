package com.folksdev.secondhand.user;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int year = input.nextInt();

        if (year <= 0) {
            System.out.println("Geçersiz yıl girdiniz.");
            return;
        }

        String[] zodiacs = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        int index = year % 12;

        System.out.println("Çin Zodyağı: " + zodiacs[index]);

        input.close();
    }
}
