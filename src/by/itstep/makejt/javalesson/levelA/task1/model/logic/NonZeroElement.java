package by.itstep.makejt.javalesson.levelA.task1.model.logic;

public class NonZeroElement {

    public static int countOfNonZeroElement(int[] array) {

        if (array == null || array.length == 0) {
            return -1;
        }
        int count = 0;

        for (int element : array) {
            if (element != 0) {
                count++;
            }
        }

        return count;
    }
}
