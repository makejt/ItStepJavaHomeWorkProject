package by.itstep.makejt.javastages.stage14.levelB.controller;

//    9) Необходимо написать программу, которая подсчитывает количество элементов
//    вектора целочисленных значений, которые по модулю (абсолютному значению)
//    равны заданному числу N, где N задаётся пользователем.

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelB.model.logic.VectorB;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInit(array, min, max);

        int n = ArrayInitializer.inputIntValue("Input number for comparison:");

        int count = VectorB.countElementsEqualN(array, n);
        Printer.print("Vector:" + Arrays.toString(array));
        String msg = String.format("\nCount of elements equal %d is %d", n, count);
        Printer.print(msg);
    }
}
