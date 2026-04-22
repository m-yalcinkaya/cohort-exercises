package com.folksdev.secondhand.user;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int n = input.nextInt();

        int n1 = 0, n2 = 1;

        System.out.print(n + " Elemanlı Fibonacci Serisi: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(n1 + " ");

            int total = n1 + n2;
            n1 = n2;
            n2 = total;
        }

        input.close();
    }
    }
}
