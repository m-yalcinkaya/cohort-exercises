package com.folksdev.secondhand.user;

public class LetterBApp {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                // En üst, orta ve en alt yatay çizgiler
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                }
                // Sol dikey çizgi ve sağ dikey çizgi
                else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                }
                // İç boşluklar
                else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
