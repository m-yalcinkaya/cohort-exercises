package com.folksdev.secondhand.user;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n1, n2, total;

        Scanner input = new Scanner(System.in);
        System.out.print("first value: ");
        n1 = input.nextInt();
        System.out.print("second value: ");
        n2 = input.nextInt();

        System.out.println("1-Toplam islemi\n2-Cikarma islemi\n3-Carpma islemi\n4-Bolme islemi");

        total = input.nextInt();

        switch (total) {
            case 1:
                System.out.println("result: " + (n1 + n2));
                break;
            case 2:
                System.out.println("result: " + (n1 - n2));
                break;
            case 3:
                System.out.println("result: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Bir sayi 0 ile bolunemez");
                } else {
                    System.out.println("result: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
        }
    }
