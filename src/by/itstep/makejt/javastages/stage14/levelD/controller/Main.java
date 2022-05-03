package by.itstep.makejt.javastages.stage14.levelD.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelD.model.logic.VectorD;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

//    4) Необходимо разработайте программу, которая проверяет, что среди элементов
//    вектора есть хотя бы одна пара взаимно противоположных.


    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInit(array, min, max);

        Printer.print("Vector:" + Arrays.toString(array));
        boolean result = VectorD.isOppositeElements(array);
        String msg = result ? "\nYes, there are min one couple of opposite numbers":
                "No, there aren't couple of opposite numbers";
        Printer.print(msg);

    }

}
