package by.itstep.makejt.javastages.stage11.task01.controller;

import by.itstep.makejt.javastages.stage11.task01.model.logic.HeadsOrTails;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please input number of coin tosses:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String msg = HeadsOrTails.countHeadsOrTails(number);
        Printer.print(msg);

        scanner.close();
    }
}
