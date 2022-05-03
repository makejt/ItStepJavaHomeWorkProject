package by.itstep.makejt.javastages.stage14.levelE.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelE.model.logic.VectorE;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

//    13) В векторе, состоящем из вещественных элементов, вычислить сумму элементов,
//    расположенных между первым и последним отрицательными элементами.

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        double[] array = new double[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInitDouble(array, min, max);

        Printer.print("Vector:" + Arrays.toString(array));
        double count = VectorE.countElements(array);
        String msg = "\nThe sum of elements between first ana last negative elements is " + count;
        Printer.print(msg);
    }
}
