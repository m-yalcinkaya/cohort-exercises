package com.folksdev.secondhand.user;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("Komşu eksen derecesini giriniz: ");
        a = input.nextInt();

        System.out.print("Karşı eksen derecesini giriniz: ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));


        System.out.println("Hipotenüs: " + c);







        }
    }
