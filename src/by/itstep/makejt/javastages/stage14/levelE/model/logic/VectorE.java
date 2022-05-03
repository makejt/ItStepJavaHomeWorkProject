package by.itstep.makejt.javastages.stage14.levelE.model.logic;

public class VectorE {

    private static int findFirstIndex(double[] array) {

        if (array == null || array.length == 0) {
            return -2;
        }


        int firstIndex = -1;

        for (int i = 0; i <= array.length; i++) {
            if (array[i] < 0) {
                return firstIndex = i;
            }
        }
        return firstIndex;
    }

    private static int findLastIndex(double[] array) {

        if (array == null || array.length == 0) {
            return -2;
        }

        int LastIndex = -1;

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] < 0) {
                return LastIndex = i;
            }
        }
        return LastIndex;
    }

    public static double countElements(double[] array) {

        if (array == null || array.length < 3) {
            throw new RuntimeException();
        }

        int firstIndex = findFirstIndex(array);
        int lastIndex = findLastIndex(array);

        if (firstIndex == -1 || lastIndex == -1 || firstIndex==lastIndex) {
            throw new RuntimeException();
        }

        double count = 0;
        for (int i = firstIndex + 1; i < lastIndex; i++) {
            count += array[i];
        }

        return count;
    }

}
