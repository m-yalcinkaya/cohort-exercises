package com.folksdev.secondhand.user;

import java.util.Scanner;

public class ZodiacApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ay giriniz: ");
        int month = input.nextInt();

        System.out.print("Gün giriniz: ");
        int day = input.nextInt();

        if (!isValidDay(month, day)) {
            System.out.println("Hatalı giriş yaptınız!");
            return;
        }

        String sign = getZodiac(month, day);

        System.out.println("Burcunuz: " + sign);

        input.close();
    }

    static boolean isValidDay(int month, int day) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        if (month < 1 || month > 12) return false;

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    static String getZodiac(int month, int day) {

        switch (month) {
            case 1:  return (day < 22) ? "Oğlak" : "Kova";
            case 2:  return (day < 20) ? "Kova" : "Balık";
            case 3:  return (day < 21) ? "Balık" : "Koç";
            case 4:  return (day < 21) ? "Koç" : "Boğa";
            case 5:  return (day < 22) ? "Boğa" : "İkizler";
            case 6:  return (day < 23) ? "İkizler" : "Yengeç";
            case 7:  return (day < 23) ? "Yengeç" : "Aslan";
            case 8:  return (day < 23) ? "Aslan" : "Başak";
            case 9:  return (day < 23) ? "Başak" : "Terazi";
            case 10: return (day < 23) ? "Terazi" : "Akrep";
            case 11: return (day < 22) ? "Akrep" : "Yay";
            case 12: return (day < 22) ? "Yay" : "Oğlak";
            default: return "Bilinmiyor";
        }
    }
}
