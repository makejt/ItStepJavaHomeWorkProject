package by.itstep.makejt.javastages.stage11.task02.model.logic;

public class ReverseNumber {
    public static int reverseNumber (int number){

        int number1 = number;

        int countDigits = 0;
        while (number1 > 0) {
            number1 /= 10;
            countDigits++;
        }

        int number2 = 0;

        while (number > 0) {
            int digit = number % 10;
            number2 += digit * Math.pow(10, countDigits);
            countDigits--;
            number /= 10;
        }

        return number2 /=10;
    }
}
