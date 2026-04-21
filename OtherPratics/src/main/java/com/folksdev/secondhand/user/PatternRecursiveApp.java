package com.folksdev.secondhand.user;

import java.util.Scanner;

public class PatternRecursiveApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        int n = scanner.nextInt();

        System.out.print("Çıktısı : ");
        createPattern(n, n, -5);
    }

    static void createPattern(int current, int original, int step) {
        System.out.print(current + " ");

        if (current <= 0 && step < 0) {
            if (current == original) return;
            createPattern(current + 5, original, 5);
        } else if (current < original && step > 0) {
            createPattern(current + 5, original, 5);
        } else if (current > 0 && step < 0) {
            createPattern(current - 5, original, -5);
        }
    }
}
