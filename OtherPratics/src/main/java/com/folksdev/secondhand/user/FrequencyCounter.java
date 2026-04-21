package com.folksdev.secondhand.user;

import java.util.Arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] visited = new int[list.length];
        int visitedMarker = -1;

        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {
            if (visited[i] == visitedMarker) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    visited[j] = visitedMarker;
                }
            }

            System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
        }
    }
}
