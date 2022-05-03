package by.itstep.makejt.javastages.stage14.levelA.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelA.model.logic.VectorA;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

//2) Необходимо написать программу, которая подсчитывает количество чётных
//    значений элементов вектора целочисленных значений.

public class Main {

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInit(array, min, max);

        int count = VectorA.countEvenElements(array);

        String msg = "\nCount of even elements is " + count;
        Printer.print("Vector: " + Arrays.toString(array));
        Printer.print(msg);
    }
}
