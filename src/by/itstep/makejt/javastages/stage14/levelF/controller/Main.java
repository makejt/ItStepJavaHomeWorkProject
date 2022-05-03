package by.itstep.makejt.javastages.stage14.levelF.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelF.model.logic.VectorF;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

//12) Отсортировать элементы вектора по возрастанию до первого/последнего элемента,
// равного N, где N задаётся пользователем

public class Main {

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInit(array, min, max);

        int n = ArrayInitializer.inputIntValue("Input N:");

        Printer.print("Vector (before):" + Arrays.toString(array));

        VectorF.sortElementsBeforeN(array, n);

        Printer.print("\nVector (after):" + Arrays.toString(array));

    }
}
