package by.itstep.makejt.javastages.stage12.task01.controller;

import by.itstep.makejt.javastages.stage12.task01.model.logic.ChessPiecesLogic;
import by.itstep.makejt.javastages.stage12.task01.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input 4 numbers:");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean result1 = ChessPiecesLogic.checkRookStep(x1, y1, x2, y2);
        String msg1 = result1 ? "yes" : "no";
        Printer.print(msg1);

        System.out.println();

        boolean result2 = ChessPiecesLogic.checkChessKing(x1, y1, x2, y2);
        String msg2 = result2 ? "yes" : "no";
        Printer.print(msg2);

        System.out.println();

        boolean result3 = ChessPiecesLogic.checkChessElephant(x1, y1, x2, y2);
        String msg3 = result3 ? "yes" : "no";
        Printer.print(msg3);

        System.out.println();

        boolean result4 = ChessPiecesLogic.checkChessQueen(x1, y1, x2, y2);
        String msg4 = result4 ? "yes" : "no";
        Printer.print(msg4);

        System.out.println();

        boolean result5 = ChessPiecesLogic.checkChessKnight(x1, y1, x2, y2);
        String msg5 = result5 ? "yes" : "no";
        Printer.print(msg5);

        scanner.close();

    }


}
