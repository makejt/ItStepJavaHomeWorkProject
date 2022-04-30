package by.itstep.makejt.javastages.stage15.mainTask.model.logic;

public class ArraySorting {

    public static int [] uniteArrays(int [] array1, int [] array2, int n, int m) {

        if (array1 == null || array2 == null || n < 1 || m < 1){
            throw new RuntimeException();
        }


        int[] array3 = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            array3[k++] = (array1[i] < array2[j]) ? array1[i++] : array2[j++];

        }
        while (i < n) {
            array3[k++] = array1[i++];
        }
        while (j < m) {
            array3[k++] = array2[j++];
        }

    return array3;

    }





}

