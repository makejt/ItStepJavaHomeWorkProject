package by.itstep.makejt.javastages.stage11.addtask01.controller;

import by.itstep.makejt.javastages.stage11.addtask01.model.logic.NOK_NOD;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        do {
            System.out.println("Please input two natural number:");
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
        } while (number1 <= 0 && number2 <= 0);


        int NOD = NOK_NOD.countNOD(number1, number2);
        Printer.print("NOD = " + NOD);

        System.out.println();

        int NOK = NOK_NOD.countNOK(number1, number2);
        Printer.print("NOK = " + NOK);

        scanner.close();
    }
}
