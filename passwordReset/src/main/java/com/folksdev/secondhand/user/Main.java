package com.folksdev.secondhand.user;

import java.util.Scanner;

public class Main {

    static String realUser = "A";
    static String realPass = "1";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = getInput(input, "Kullanıcı adı: ");
        String password = getInput(input, "Şifre: ");

        if (isLoginSuccess(username, password)) {
            System.out.println("Başarılı şekilde giriş yaptınız.");
        } else {
            handleWrongLogin(input);
        }

        input.close();
    }

    static String getInput(Scanner input, String message) {
        System.out.print(message);
        return input.nextLine();
    }

    static boolean isLoginSuccess(String username, String password) {
        return username.equals(realUser) && password.equals(realPass);
    }

    static void handleWrongLogin(Scanner input) {
        System.out.println("Kullanıcı adı veya şifre yanlış!");

        String answer = getInput(input, "Şifreyi sıfırlamak ister misiniz? (evet/hayır): ");

        if (answer.equalsIgnoreCase("evet")) {
            resetPassword(input);
        } else {
            System.out.println("İşlem iptal edildi.");
        }
    }

    static void resetPassword(Scanner input) {
        String newPassword = getInput(input, "Yeni şifreyi giriniz: ");

        if (newPassword.equals(realPass)) {
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else {
            realPass = newPassword;
            System.out.println("Şifre oluşturuldu.");
        }
    }
}