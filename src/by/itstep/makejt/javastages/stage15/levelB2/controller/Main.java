package by.itstep.makejt.javastages.stage15.levelB2.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage15.levelB2.model.logic.Transposition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = ArrayInitializer.inputIntValue("Input size of square matrix:");

        int[][] array = new int[n][n];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input elements of line №" + (i + 1) + "\n");
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Original matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        int[][] array1 = Transposition.transposeMatrix(array);
        System.out.print("Transposition matrix:");
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }

    }
}
