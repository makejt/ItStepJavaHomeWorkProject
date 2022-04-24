package by.itstep.makejt.javastages.stage15.mainTask.controller;

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


        System.out.println("Array1 \n" + Arrays.toString(array1));
        System.out.println("Array2 \n" + Arrays.toString(array2));


    }
}
