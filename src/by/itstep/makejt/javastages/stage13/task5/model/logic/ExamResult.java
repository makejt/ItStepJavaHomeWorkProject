package by.itstep.makejt.javastages.stage13.task5.model.logic;

public class ExamResult {

    public static int sumOfMarks(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int countFives(int[] array) {
        int count5 = 0;
        for (int element : array) {
            if (element == 5) {
                count5++;
            }
        }
        return count5;
    }

    public static int countFours(int[] array) {
        int count4 = 0;
        for (int element : array) {
            if (element == 4) {
                count4++;
            }
        }
        return count4;
    }

    public static int countTriplets(int[] array) {
        int count3 = 0;
        for (int element : array) {
            if (element == 3) {
                count3++;
            }
        }
        return count3;
    }

    public static int countDeuces(int[] array) {
        int count2 = 0;
        for (int element : array) {
            if (element == 2) {
                count2++;
            }
        }
        return count2;
    }

    public static int countUnits(int[] array) {
        int count1 = 0;
        for (int element : array) {
            if (element == 1) {
                count1++;
            }
        }
        return count1;
    }

    public static int countZeros(int[] array) {
        int count0 = 0;
        for (int element : array) {
            if (element == 0) {
                count0++;
            }
        }
        return count0;
    }

    public static double percentFives(int count5, int sum) {
        return (double) count5 / sum * 100;
    }

    public static double percentFours(int count4, int sum) {
        return (double) count4 / sum * 100;
    }

    public static double percentTriplets(int count3, int sum) {
        return (double) count3 / sum * 100;
    }

    public static double percentDeuces(int count2, int sum) {
        return (double) count2 / sum * 100;
    }

    public static double percentUnits(int count1, int sum) {
        return (double) count1 / sum * 100;
    }

    public static double percentZeros(int count0, int sum) {
        return (double) count0 / sum * 100;
    }
}



