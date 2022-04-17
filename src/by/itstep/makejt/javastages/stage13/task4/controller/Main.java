package by.itstep.makejt.javastages.stage13.task4.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage13.task4.model.logic.CheckArray;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size = ArrayInitializer.inputIntValue("Input size of vector:");

        int[] array = new int[size];

        System.out.println("Input elements of vector:");
        ArrayInitializer.userInit(array);

        Printer.print("Array: " + Arrays.toString(array));

        int countEvent = CheckArray.CountEvenElements(array);
        int countNotEvent = CheckArray.CountNotEvenElements(array);

        String msg = String.format("Vector includes %d even element " +
                        "and %d not even element", countEvent, countNotEvent);

        Printer.print("\n" + msg);


    }
}
