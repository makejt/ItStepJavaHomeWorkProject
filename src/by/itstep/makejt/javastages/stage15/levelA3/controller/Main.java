package by.itstep.makejt.javastages.stage15.levelA3.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage15.levelA3.model.logic.CheckArray;
import by.itstep.makejt.view.Printer;

import java.util.Scanner;

public class Main {


    // Среди столбцов заданной матрицы, содержащих только такие элементы,
    // которые по модулю не больше n, найти столбец с минимальным произведением элементов.

    public static void main(String[] args) {

        int n = ArrayInitializer.inputIntValue("Input number of matrix lines:");
        int m = ArrayInitializer.inputIntValue("Input number of matrix columns:");

        int[][] array = new int[n][m];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input elements of line №" + (i + 1) + "\n");
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        int number = ArrayInitializer.inputIntValue("\nInput number for comparison:");

        int index = CheckArray.findIndexOfColumns(array, n, m, number);
        String msg = String.format("Column № %d with minimum product of elements less then %d", index, number);
        Printer.print(msg);

    }
}

