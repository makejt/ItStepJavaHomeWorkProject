package by.itstep.makejt.javastages.stage14.levelA.model.logic;

public class VectorA {

    public static int countEvenElements(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int element : array) {
            if (element % 2 == 0) {
                count++;
            }
        }

        return count;

    }

}
