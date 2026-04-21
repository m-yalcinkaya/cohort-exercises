package com.folksdev.secondhand.user;

import java.util.Arrays;
import java.util.Scanner;

public class NearestNumberApp {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int input = scanner.nextInt();

        // Diziyi küçükten büyüğe sıralıyoruz
        Arrays.sort(list);

        int minNearest = list[0];
        int maxNearest = list[list.length - 1];

        for (int i : list) {
            if (i < input) {
                minNearest = i;
            }
            if (i > input) {
                maxNearest = i;
                // İlk büyük sayıyı bulduğumuzda döngüyü kırabiliriz çünkü dizi sıralı
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minNearest);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxNearest);
    }
}
