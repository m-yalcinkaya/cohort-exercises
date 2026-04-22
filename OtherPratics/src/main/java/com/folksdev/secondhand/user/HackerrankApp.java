package com.folksdev.secondhand.user;

import java.util.Scanner;

public class HackerrankApp {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int toplam = 0;
            for(int j=0; j<n; j++){


                toplam += (Math.pow(2, j)*b);
                if(j==n-1)
                    System.out.println(toplam+a);
                else
                    System.out.print(toplam+a + " ");
            }

        }
        in.close();
    }
}
