package com.folksdev.secondhand.user;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        double boy = 0, kilo =0, index = 0;

        System.out.print("Lütfen boyunuzu (m) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) giriniz : ");
        kilo = input.nextDouble();
        input.close();
        // Formül
        // Vücut Kitle İndeks: Kilo (kg) / Boy(m) * Boy(m)
        index = kilo / (boy * boy);

        System.out.format("Vücut Kitle İndeksi: %.2f\n",index);
        }
    }
