package com.folksdev.secondhand.user;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            double KDV = 0;

        System.out.print("Tutar giriniz: ");
            double tutar = sc.nextDouble();


            if((0<tutar)&&(tutar<1000))
                KDV = (double) 18 /100;
            else if(1000<tutar)
                KDV = (double) 8 /100;



        System.out.println("KDV'siz Fiyat = " + tutar);
        System.out.println("KDV'li Fiyat = " + (tutar + tutar*KDV));
        System.out.println("KDV tutari = " + (tutar*KDV));



    }
}