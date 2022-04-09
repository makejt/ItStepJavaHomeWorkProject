package by.itstep.makejt.javastages.stage11.task03.model.logic;

public class PrimeNumber {
    public static boolean isPrimeNumber (double number){
        boolean result = false;

        int count = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 0 && number != 1){
            result = true;
        }

        return result;

    }
}
