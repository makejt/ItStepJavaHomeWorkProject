package by.itstep.makejt.javastages.stage13.task3.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage13.task3.model.logic.ArrayService;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int size = ArrayInitializer.inputIntValue("Input size of vector:");

        int[] array = new int[size];

        System.out.println("Input elements of vector:");
        ArrayInitializer.userInit(array);

        Printer.print("Array: " + Arrays.toString(array));

        boolean result1 = ArrayService.isAllElementsEqual(array);

        String msg1 = result1 ? "yes, all elements are equal" :
                "no, elements aren't equal";

        Printer.print("\n" + msg1);

        boolean result2= ArrayService.isAllElementsDifferent(array);

        String msg2 = result2 ? "yes, all elements are different" :
                "no, elements aren't different";

        Printer.print("\n" + msg2);

    }
}
