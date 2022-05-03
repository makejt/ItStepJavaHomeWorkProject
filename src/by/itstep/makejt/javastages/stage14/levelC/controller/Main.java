package by.itstep.makejt.javastages.stage14.levelC.controller;

import by.itstep.makejt.javalesson.util.ArrayInitializer;
import by.itstep.makejt.javastages.stage14.levelC.model.logic.VectorC;
import by.itstep.makejt.view.Printer;

import java.util.Arrays;

//6) Необходимо написать программу, которая подсчитывает количество элементов вектора
// целочисленных значений, которые приблизительно равны среднегеометрическому значению
// всех значений элементов искомого вектора с погрешностью плюс/минус D, где D задаётся пользователем.


public class Main {

    public static void main(String[] args) {

        int size = ArrayInitializer.inputIntValue("Input size of vector:");
        int[] array = new int[size];
        int min = ArrayInitializer.inputIntValue("Input min element of vector:");
        int max = ArrayInitializer.inputIntValue("Input max element of vector:");
        ArrayInitializer.randomInit(array, min, max);

        int d = ArrayInitializer.inputIntValue("Input d");

        Printer.print("Vector:" + Arrays.toString(array));

        double p = VectorC.findGeometricMean(array);

        int count = VectorC.countElements(array, d);
        String msg = String.format("\nCount of elements " +
                "equal %f (+- %d) is %d", p, d, count);
        Printer.print(msg);

    }

}
