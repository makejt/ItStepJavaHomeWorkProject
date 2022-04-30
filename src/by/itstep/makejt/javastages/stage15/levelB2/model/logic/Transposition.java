package by.itstep.makejt.javastages.stage15.levelB2.model.logic;

public class Transposition {

    public static int[][] transposeMatrix(int[][] array) {

        if (array == null || array.length <= 2) {
            throw new RuntimeException();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        return array;
    }
}



