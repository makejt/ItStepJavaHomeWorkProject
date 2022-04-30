package by.itstep.makejt.javastages.stage15.mainTask.controller;

import by.itstep.makejt.javastages.stage15.mainTask.model.logic.ArraySorting;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input size of the first array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        System.out.println("Input elements of the first array");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Input size of the second array");
        int m = scanner.nextInt();
        int[] array2 = new int[m];
        System.out.println("Input elements of the second array");
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }


        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        int [] array3 = ArraySorting.uniteArrays(array1, array2, n, m);
        Printer.print("Array3: " + Arrays.toString(array3));



    }
}
