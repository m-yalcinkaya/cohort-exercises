package com.folksdev.secondhand.user;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int year = input.nextInt();

        boolean leapYear = (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);

        if (leapYear) {
            System.out.println(year + " artık yıldır.");
        } else {
            System.out.println(year + " artık yıl değildir.");
        }

        input.close();
    }
}