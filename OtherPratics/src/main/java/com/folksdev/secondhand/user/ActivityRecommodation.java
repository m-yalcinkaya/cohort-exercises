package com.folksdev.secondhand.user;

import java.util.Scanner;

public class ActivityRecommodation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığı giriniz: ");
        int heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat <= 25) {
            System.out.println("Piknik yapabilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }

        input.close();
    }
}
