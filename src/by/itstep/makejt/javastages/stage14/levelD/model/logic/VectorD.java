package by.itstep.makejt.javastages.stage14.levelD.model.logic;

public class VectorD {

    public static boolean isOppositeElements(int[] array) {

        if (array == null || array.length == 0) {
            throw new RuntimeException();
        }

        boolean result = false;

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == -temp) {
                    return true;
                }
            }
        }

        return false;
    }
}
