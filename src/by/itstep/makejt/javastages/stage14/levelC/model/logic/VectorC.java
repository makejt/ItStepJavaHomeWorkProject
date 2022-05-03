package by.itstep.makejt.javastages.stage14.levelC.model.logic;

public class VectorC {

    public static double findGeometricMean(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int p = 1;

        for (int element : array) {
            p *= element;
        }

        return Math.pow(p, 1.0 / 3);
    }


    public static int countElements(int[] array, int d) {

        if (array == null || array.length == 0) {
            return -1;
        }

        double n = findGeometricMean(array);

        int count = 0;

        for (int element : array) {
            if (element == n || (element < n && element > n - d) ||
                    (element > n && element < n + d)) {
                count++;
            }
        }
        return count;
    }
}
