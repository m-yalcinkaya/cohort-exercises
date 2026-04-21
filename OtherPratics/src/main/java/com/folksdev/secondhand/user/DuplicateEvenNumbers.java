package com.folksdev.secondhand.user;

public class DuplicateEvenNumbers {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
        int[] duplicateEvens = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                // Aynı indisteki elemanları karşılaştırma, çift mi bak ve tekrar var mı kontrol et
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicateEvens, list[i])) {
                        duplicateEvens[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Tekrar Eden Çift Sayılar:");
        for (int value : duplicateEvens) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }

    // Dizide daha önce bulunup bulunmadığını kontrol eden yardımcı metot
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
