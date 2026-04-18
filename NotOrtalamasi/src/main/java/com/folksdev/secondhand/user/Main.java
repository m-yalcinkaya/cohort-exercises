package com.folksdev.secondhand.user;

import javax.naming.directory.AttributeInUseException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mathNote, physicsNote, chemicalNote, turkishNote, historyNote, musicNote;

        System.out.print("Matematik Puanı: ");
        mathNote = sc.nextInt();
        System.out.print("Fizik Puanı: ");
        physicsNote = sc.nextInt();
        System.out.print("Kimya Puanı: ");
        chemicalNote = sc.nextInt();
        System.out.print("Türkçe Puanı: ");
        turkishNote = sc.nextInt();
        System.out.print("Tarih Puanı: ");
        historyNote = sc.nextInt();
        System.out.print("Muzik Puanı: ");
        musicNote = sc.nextInt();


        int toplam=0;

        toplam = mathNote + physicsNote + chemicalNote + turkishNote + musicNote + historyNote;

        int avarage = toplam/6;

         System.out.println((avarage>60) ? "Sınıfı Geçti." : "Sınıfta Kaldı.");

    }
}