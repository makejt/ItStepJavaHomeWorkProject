package by.itstep.makejt.javastages.stage14.levelF.model.logic;

public class VectorF {

    private static int findIndexFirstElementEqualN(int[] array, int n) {

        if (array == null || array.length == 0) {
            return -2;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }


    private static void sortBeforeIndex(int[] array, int index) {
        if (index > 1) {
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void sortElementsBeforeN(int[] array, int n) {
        int index = findIndexFirstElementEqualN(array, n);
        sortBeforeIndex(array, index);

    }


}
