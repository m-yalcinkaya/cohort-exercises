package com.folksdev.secondhand.user;

import java.util.Scanner;

public class LoopApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int sayi = scanner.nextInt();
        System.out.print("4ün kuvvetleri: ");

        for(int i=1; i<=sayi; i*=4){
            System.out.print(i + " ");
        }
        System.out.print("\n5ün kuvvetleri: ");

        for(int i=1; i<=sayi; i*=5){
            System.out.print(i + " ");
        }
    }
}
