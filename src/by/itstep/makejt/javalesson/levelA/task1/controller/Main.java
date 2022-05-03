package by.itstep.makejt.javalesson.levelA.task1.controller;

import by.itstep.makejt.javalesson.levelA.task1.model.logic.NonZeroElement;
import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of array:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min:");
        int max = ArrayInitializer.inputIntValue("Input max:");

        ArrayInitializer.randomInit(array, min, max);

        int count = NonZeroElement.countOfNonZeroElement(array);

        String msg = String.format("\n Count of non-zero array elements = %d", count);
        Printer.print("Array: " + Arrays.toString(array));
        Printer.print(msg);

    }
}
