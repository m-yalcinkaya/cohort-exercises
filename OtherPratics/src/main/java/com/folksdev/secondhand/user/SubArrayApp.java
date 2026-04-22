package com.folksdev.secondhand.user;

import java.util.Scanner;

public class SubArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        int negativeSubarrayCount = 0;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                if (currentSum < 0) {
                    negativeSubarrayCount++;
                }
            }
        }

        System.out.println(negativeSubarrayCount);
    }
}

