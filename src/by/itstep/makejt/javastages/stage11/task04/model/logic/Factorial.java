package by.itstep.makejt.javastages.stage11.task04.model.logic;

public class Factorial {
    public static int countFactorial(int number) {

        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }

        return factorial;
    }
}
