package by.itstep.makejt.javastages.stage11.task03.controller;

import by.itstep.makejt.javastages.stage11.task03.model.logic.PrimeNumber;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        do {
            System.out.println("Please input natural number:");
            number = scanner.nextDouble();
        } while (number <= 0);

        boolean result = PrimeNumber.isPrimeNumber(number);

        String msg = result? "yes, it's prime number":
                "no, it isn't prime number";
        Printer.print(msg);

        scanner.close();

    }
}