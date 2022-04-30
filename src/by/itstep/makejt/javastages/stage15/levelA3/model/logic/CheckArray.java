package by.itstep.makejt.javastages.stage15.levelA3.model.logic;

public class CheckArray {

    public static int findIndexOfColumns(int [][] array, int n, int m, int number) {

        if (array == null || array.length == 0){
            return -1;
        }

        int tempValue = Integer.MAX_VALUE;
        int index = -1;

        for (int j = 0; j < m; j++) {

            if (array[0][j] <= number) {

                int p = array[0][j];
                for (int i = 1; i < n; i++) {
                    if (array[i][j] <= number) {
                        p *= array[i][j];
                    } else p = Integer.MAX_VALUE;
                }
                if (p < tempValue) {
                    tempValue = p;
                    index = j + 1;
                }
            }
        }

        return index;
    }


}
