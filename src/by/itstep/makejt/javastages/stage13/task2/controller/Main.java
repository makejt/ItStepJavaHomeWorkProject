package by.itstep.makejt.javastages.stage13.task2.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage13.task2.model.logic.MirrorSorting;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = ArrayInitializer.inputIntValue("Input size of vector:");

        int[] array = new int[size];

        System.out.println("Input elements of vector:");
        ArrayInitializer.userInit(array);

        Printer.print("Array: " + Arrays.toString(array));

        boolean result = MirrorSorting.isMirrorSortingArray(array);

        String msg = result ? "yes, elements are mirrored according to the center" :
                "no, elements aren't mirrored according to the center";

        Printer.print("\n" + msg);
    }
}
