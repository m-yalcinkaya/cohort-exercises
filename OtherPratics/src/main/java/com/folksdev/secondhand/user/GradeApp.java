package com.folksdev.secondhand.user;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int not;
        float sum = 0;
        int counter = 0;

        for (String ders : dersler) {
            System.out.print(ders + " notu gir: ");
            not = input.nextInt();

            if (not >= 0 && not <= 100) {
                sum += not;
                counter++;
            } else {
                System.out.println("Geçersiz sayı! (0-100 arası gir)");
            }
        }

        if (counter == 0) {
            System.out.println("Geçerli not girilmedi!");
            return;
        }

        float average = sum / counter;

        System.out.println("Ortalama: " + average);

        if (average >= 55) {
            System.out.println("Geçtiniz!");
        } else {
            System.out.println("Kaldınız.");
        }

        input.close();
    }
}