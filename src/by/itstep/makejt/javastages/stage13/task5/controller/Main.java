package by.itstep.makejt.javastages.stage13.task5.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage13.task5.model.logic.ExamResult;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = ArrayInitializer.inputIntValue("Input number of students:");
        int[] array = new int[number];

        System.out.println("Input marks:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Printer.print("Marks: " + Arrays.toString(array));

        int sum = ExamResult.sumOfMarks(array);

        int count5 = ExamResult.countFives(array);
        int count4 = ExamResult.countFours(array);
        int count3 = ExamResult.countTriplets(array);
        int count2 = ExamResult.countDeuces(array);
        int count1 = ExamResult.countUnits(array);
        int count0 = ExamResult.countZeros(array);

        double percent5 = ExamResult.percentFives(count5, sum);
        double percent4 = ExamResult.percentFours(count4, sum);
        double percent3 = ExamResult.percentTriplets(count3, sum);
        double percent2 = ExamResult.percentDeuces(count2, sum);
        double percent1 = ExamResult.percentUnits(count1, sum);
        double percent0 = ExamResult.percentZeros(count0, sum);

        String msg5 = String.format("\nFives: %.2f", percent5) + "% (" + count5 + ")";
        String msg4 = String.format("\nFours: %.2f", percent4) + "% (" + count4 + ")";
        String msg3 = String.format("\nTriplets: %.2f", percent3) + "% (" + count3 + ")";
        String msg2 = String.format("\nDeuces: %.2f", percent2) + "% (" + count2 + ")";
        String msg1 = String.format("\nUnits: %.2f", percent1) + "% (" + count1 + ")";
        String msg0 = String.format("\nZeros: %.2f", percent0) + "% (" + count0 + ")";

        Printer.print(msg5 + msg4 + msg3 + msg2 + msg1 + msg0);
    }

}
