package com.folksdev.secondhand.user;

import java.util.Scanner;

public class CombinationCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Eleman sayisi: ");
        int elemanSayisi = scanner.nextInt();
        System.out.print("Altgrup Eleman sayisi: ");
        int grupElemanSayisi = scanner.nextInt();
        int kombinasyon = faktoriyelHesapla(elemanSayisi) / (faktoriyelHesapla(grupElemanSayisi) * (faktoriyelHesapla(elemanSayisi-grupElemanSayisi)));

        System.out.println("Kombinasyon: " + kombinasyon);




    }

    static int faktoriyelHesapla(int sayi){
        if(sayi>1) return sayi * faktoriyelHesapla(--sayi);
        else return 1;
    }
}
