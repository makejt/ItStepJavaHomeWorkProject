package by.itstep.makejt.javastages.stage11.task04.controller;

import by.itstep.makejt.javastages.stage11.task04.model.logic.Factorial;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number;
        do {
            System.out.println("Please input natural number:");
            number = scanner.nextDouble();
        } while (number < 0);

        String msg = Factorial.countFactorial(number) + "";

        Printer.print(msg);

    }
}
