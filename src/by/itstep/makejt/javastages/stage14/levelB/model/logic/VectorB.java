package by.itstep.makejt.javastages.stage14.levelB.model.logic;

public class VectorB {

    public static int countElementsEqualN(int[] array, int n) {

        if (array == null || array.length == 0) {
            return -1;
        }

        int count = 0;

        for (int element : array) {
            if (element == n || element == -n) {
                count++;
            }
        }
        return count;
    }
}