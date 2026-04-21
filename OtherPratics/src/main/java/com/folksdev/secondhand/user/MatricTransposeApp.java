package com.folksdev.secondhand.user;

public class MatricTransposeApp {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int row = matrix.length;
        int column = matrix[0].length;

        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matris :");
        printMatrix(matrix);

        System.out.println("Transpoze :");
        printMatrix(transpose);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "    ");
            }
            System.out.println();
        }
    }
}
