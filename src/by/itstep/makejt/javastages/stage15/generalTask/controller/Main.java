package by.itstep.makejt.javastages.stage15.generalTask.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage15.generalTask.model.logic.AcademicPerformance;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = ArrayInitializer.inputIntValue("Input number of the students group:");
        int m = ArrayInitializer.inputIntValue("Input number of the students in a group:");

        int[][] array = new int[n][m];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Input marks of group №" + (i + 1) + "\n");
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nMarks of group № " + (i + 1));
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
        }

        int group1 = AcademicPerformance.findGroupWithMaxAverageMark(array, n, m);
        String msg1 = String.format("\nStudent group № %d with max average mark", group1);
        Printer.print(msg1);

        int group2 = AcademicPerformance.findGroupWithMinAverageMark(array, n, m);
        String msg2 = String.format("\nStudent group № %d with min average mark", group2);
        Printer.print(msg2);

        int group3 = AcademicPerformance.findGroupWithMaxCountOfTens(array, n, m);
        String msg3 = String.format("\nStudent group № %d with max count of tens", group3);
        Printer.print(msg3);

        String msg = AcademicPerformance.findGroupWithUnsatisfactoryMarks(array, n, m);
        Printer.print("\nGroups with unsatisfactory marks:" + msg);

        int[][] array1 = AcademicPerformance.findGroupWithHighPerformance(array, n, m);

        for (int i = 0; i < n; i++) {
            System.out.println("\nMarks of group № " + (i + 1) + " after changes");
            for (int j = 0; j < m; j++) {
                System.out.print(array1[i][j] + " ");
            }
        }
    }
}









