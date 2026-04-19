package com.folksdev.secondhand.user;

import java.util.Scanner;

public class ZodiacApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        int month = input.nextInt();

        System.out.print("Gün giriniz: ");
        int day = input.nextInt();

        if (!isValidDate(month, day)) {
            System.out.println("Hatalı giriş yaptınız!");
            return;
        }

        System.out.println("Burcunuz: " + getZodiac(month, day));

        input.close();
    }

    static boolean isValidDate(int month, int day) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        return month >= 1 && month <= 12 &&
                day >= 1 && day <= days[month - 1];
    }

    static String getZodiac(int month, int day) {

        String[] signs = {
                "Oğlak", "Kova", "Balık", "Koç", "Boğa", "İkizler",
                "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak"
        };

        int[] changeDays = {
                22, 20, 21, 21, 22, 23,
                23, 23, 23, 23, 22, 22
        };

        if (day < changeDays[month - 1]) {
            return signs[month - 1];
        } else {
            return signs[month];
        }
    }
}