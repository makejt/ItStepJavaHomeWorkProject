package by.itstep.makejt.javastages.stage13.task4.model.logic;

public class CheckArray {
    public static int CountEvenElements(int [] array){

        if (array == null || array.length == 0){
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 == 0){
               count++;
            }
        }

        return count;
    }

    public static int CountNotEvenElements(int [] array){

        if (array == null || array.length == 0){
            return -1;
        }

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 != 0){
                count++;
            }
        }

        return count;
    }

}
