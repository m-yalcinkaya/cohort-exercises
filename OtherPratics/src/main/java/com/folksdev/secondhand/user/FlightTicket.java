package com.folksdev.secondhand.user;

import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe giriniz (KM): ");
        int km = input.nextInt();

        System.out.print("Yolculuk türü (1: Tek yön, 2: Gidiş-Dönüş): ");
        int travelType = input.nextInt();

        System.out.print("Yaş giriniz: ");
        int age = input.nextInt();

        if (km <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        double pricePerKm = 0.10;
        double totalPrice = km * pricePerKm;

        if (travelType == 2) {
            totalPrice *= 2;
        }

        if (age < 12) {
            totalPrice *= 0.5;
        } else if (age <= 24) {
            totalPrice *= 0.9;
        } else if (age > 65) {
            totalPrice *= 0.7;
        }

        if (travelType == 2) {
            totalPrice *= 0.8;
        }

        System.out.println("Toplam Tutar: " + totalPrice + " TL");

        input.close();
    }
}