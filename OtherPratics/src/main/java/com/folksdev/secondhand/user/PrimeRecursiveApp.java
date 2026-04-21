package com.folksdev.secondhand.user;

import java.util.Scanner;

public class PrimeRecursiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }

    static boolean isPrime(int number, int i) {
        if (number <= 2) {
            return (number == 2);
        }
        if (number % i == 0) {
            return false;
        }
        if (i * i > number) {
            return true;
        }

        return isPrime(number, i + 1);
    }
}
