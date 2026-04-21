package com.folksdev.secondhand.user;

import java.util.Scanner;

public class PowerMethodApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taban değeri giriniz :");
        int base = scanner.nextInt();

        System.out.print("Üs değeri giriniz :");
        int exponent = scanner.nextInt();

        System.out.println("Sonuç : " + power(base, exponent));
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}
