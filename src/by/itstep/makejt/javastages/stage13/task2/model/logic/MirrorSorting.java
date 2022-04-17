package by.itstep.makejt.javastages.stage13.task2.model.logic;

public class MirrorSorting {
    public static boolean isMirrorSortingArray(int[] array) {

        if (array == null || array.length < 2) {
            throw new RuntimeException();
        }

        for (int i = 1; i < array.length / 2; i++) {

            if (array[array.length / 2 - i] != array[array.length / 2 + i]) {
                return false;
            }
        }
        return true;
    }
}
