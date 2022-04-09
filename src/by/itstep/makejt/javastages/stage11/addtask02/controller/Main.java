package by.itstep.makejt.javastages.stage11.addtask02.controller;

import by.itstep.makejt.javastages.stage11.addtask02.magic.logic.ArmstrongNumber;
import by.itstep.makejt.javastages.stage11.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;
        do {
            System.out.println("Please input count of digit - from 2 to 5:");
            count = scanner.nextInt();
        } while (count < 2 || count > 5);

        String msg = ArmstrongNumber.findArmstrongNumber(count);
        Printer.print(msg);
    }
}
