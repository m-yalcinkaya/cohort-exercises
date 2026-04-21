package com.folksdev.secondhand.user.MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    String[][] mineMap;
    String[][] gameMap;
    int rowNumber;
    int colNumber;
    int mineCount;
    int right;

    MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.mineMap = new String[rowNumber][colNumber];
        this.gameMap = new String[rowNumber][colNumber];
        this.mineCount = (rowNumber * colNumber) / 4;
        this.right = (rowNumber * colNumber) - this.mineCount;
    }

    public void run() {
        Scanner scan = new Scanner(System.in);
        prepareGame();

        System.out.println("Mayınların Konumu");
        printMap(mineMap);
        System.out.println("===========================");
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        while (right > 0) {
            printMap(gameMap);
            System.out.print("Satır Giriniz : ");
            int r = scan.nextInt();
            System.out.print("Sütun Giriniz : ");
            int c = scan.nextInt();

            if (r < 0 || r >= rowNumber || c < 0 || c >= colNumber) {
                System.out.println("Geçersiz koordinat! Lütfen sınırlar dahilinde giriniz.");
                continue;
            }

            if (!gameMap[r][c].equals("-")) {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;
            }

            if (mineMap[r][c].equals("*")) {
                System.out.println("Game Over!!");
                break;
            } else {
                int count = checkMine(r, c);
                gameMap[r][c] = String.valueOf(count);
                right--;
            }

            if (right == 0) {
                System.out.println("Oyunu Kazandınız !");
                printMap(gameMap);
            }
            System.out.println("===========================");
        }
    }

    public void prepareGame() {
        Random rand = new Random();
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }

        int count = 0;
        while (count != mineCount) {
            int r = rand.nextInt(rowNumber);
            int c = rand.nextInt(colNumber);
            if (!mineMap[r][c].equals("*")) {
                mineMap[r][c] = "*";
                count++;
            }
        }
    }

    public int checkMine(int r, int c) {
        int count = 0;
        for (int i = (r - 1); i <= (r + 1); i++) {
            for (int j = (c - 1); j <= (c + 1); j++) {
                if (i >= 0 && i < rowNumber && j >= 0 && j < colNumber) {
                    if (mineMap[i][j].equals("*")) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public void printMap(String[][] map) {
        for (String[] row : map) {
            for (String col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}