package by.itstep.makejt.javastages.stage11.task05.controller;

import by.itstep.makejt.javastages.stage11.task05.model.logic.PrimeDivisions;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Please input natural number:");
            number = scanner.nextInt();
        } while (number < 0);

        String msg = PrimeDivisions.findPrimeDivisions(number);
        Printer.print(msg);
    }
}