package by.itstep.makejt.javastages.stage13.task1.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage13.task1.model.logic.SortArray;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");

        int[] array = new int[size];

        System.out.println("Input elements of vector:");
        ArrayInitializer.userInit(array);

        Printer.print("Array: " + Arrays.toString(array));

        boolean result = SortArray.isSortingArray(array);

        String msg = result ? "yes, elements are sorting " :
                "no, elements aren't sorting";

        Printer.print("\n" + msg);
    }
}
