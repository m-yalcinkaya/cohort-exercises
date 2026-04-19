package com.folksdev.secondhand.user;

import java.util.Scanner;

public class SortBySize {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("A sayisini giriniz: ");
        int a = input.nextInt();

        System.out.print("B sayisini giriniz: ");
        int b = input.nextInt();

        System.out.print("C sayisini giriniz: ");
        int c = input.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Küçükten büyüğe: " + a + " < " + b + " < " + c);

        input.close();
    }
}
