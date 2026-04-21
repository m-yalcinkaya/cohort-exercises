package com.folksdev.secondhand.user;

public class HarmonicAverageApp {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSeries = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1.0 / numbers[i];
        }

        double harmonicAverage = numbers.length / harmonicSeries;

        System.out.println("Harmonik Seri Toplamı : " + harmonicSeries);
        System.out.println("Harmonik Ortalama : " + harmonicAverage);
    }
}
