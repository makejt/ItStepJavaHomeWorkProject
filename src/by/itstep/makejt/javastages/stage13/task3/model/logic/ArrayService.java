package by.itstep.makejt.javastages.stage13.task3.model.logic;

public class ArrayService {
    public static boolean isAllElementsEqual(int [] array){

        if (array == null || array.length < 2){
            throw new RuntimeException();
        }
        for (int i = 1; i < array.length; i++) {
            if (array [i] != array [0]){
                return false;
            }
        }
        return true;
    }

    public static boolean isAllElementsDifferent(int [] array){

        if (array == null || array.length < 2){
            throw new RuntimeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
