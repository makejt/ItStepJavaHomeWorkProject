package by.itstep.makejt.javastages.stage11.task05.model.logic;

public class PrimeDivisions {
    public static String findPrimeDivisions(int number) {

        String msg = "Prime divisions of this number: ";

        for (int i = 2; i <= number; i++) {

            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ) {
                    count++;
                }
            }
            if (number % i == 0 && count == 0) {
                msg = msg + i + " ";
            }
        }
        return msg;
    }
}