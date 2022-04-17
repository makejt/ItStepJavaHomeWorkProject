package by.itstep.makejt.javastages.stage13.task1.model.logic;

public class SortArray {

    private static boolean isAscSortingArray(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            if (array [i] > array [i + 1] ){
                return false;
            }
        }
        return true;
    }

    private static boolean isDescSortingArray(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            if (array [i] < array [i + 1] ){
                return false;
            }
        }
        return true;
    }

    public static boolean isSortingArray(int[] array){

        if (array == null || array.length < 2){
            throw new RuntimeException();
        }

        return isAscSortingArray(array) || isDescSortingArray(array);
    }
}
