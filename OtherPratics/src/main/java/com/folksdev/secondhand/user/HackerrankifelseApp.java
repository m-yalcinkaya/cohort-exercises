package com.folksdev.secondhand.user;

import java.util.Scanner;

public class HackerrankifelseApp {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N%2==1)
            System.out.print("Weird");
        else if(N>20)
            System.out.print("Not Weird");
        else if(N>5)
            System.out.print("Weird");
        else if(N>1)
            System.out.print("Not Weird");

        scanner.close();
    }
}
