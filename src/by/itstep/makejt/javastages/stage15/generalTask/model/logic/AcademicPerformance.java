package by.itstep.makejt.javastages.stage15.generalTask.model.logic;

public class AcademicPerformance {
    public static int findGroupWithMaxAverageMark(int[][] array, int n, int m) {

        double average = 0;
        int group = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
                double average1 = (double) sum / m;
                if (average1 > average) {
                    average = average1;
                    group = i + 1;
                }
            }
        }
        return group;
    }

    public static int findGroupWithMinAverageMark(int[][] array, int n, int m) {

        double average = 10;
        int group = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
                double average1 = (double) sum / m;
                if (average1 < average) {
                    average = average1;
                    group = i + 1;
                }
            }
        }
        return group;
    }

    public static int findGroupWithMaxCountOfTens(int[][] array, int n, int m) {

        int group = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int count1 = 0;
            for (int j = 0; j < m; j++) {

                if (array[i][j] == 10) {
                    count1++;
                }

                if (count1 > count) {
                    count = count1;
                    group = i + 1;
                }
            }
        }
        return group;
    }

    public static String findGroupWithUnsatisfactoryMarks(int[][] array, int n, int m) {
        int group = 0;
        String msg = "";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] < 4) {
                    msg += (i + 1) + " ";
                    break;
                }
            }
        }

        return msg;
    }

    public static double findAverageAcademyPerformance(int[][] array, int n, int m) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }


    public static int[][] findGroupWithHighPerformance(int[][] array, int n, int m) {

        double average = findAverageAcademyPerformance(array, n, m);

        for (int i = 0; i < n; i++) {

            int sum = 0;
            double average1 = 0;

            for (int j = 0; j < m; j++) {
                sum += array[i][j];
            }
            average1 = (double) sum / m;

            if (average1 > average) {
                for (int j = 0; j < m; j++) {

                    if (array[i][j] < 10) {

                        array[i][j] = array[i][j] + 1;
                    }
                }

            }


        }
        return array;
    }

}