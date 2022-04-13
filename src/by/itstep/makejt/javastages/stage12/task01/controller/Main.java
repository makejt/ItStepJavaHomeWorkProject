package by.itstep.makejt.javastages.stage12.task01.controller;

import by.itstep.makejt.javastages.stage12.task01.model.logic.ChessPiecesLogic;
import by.itstep.makejt.javastages.stage12.task01.view.Printer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        do {
            System.out.println("Please input coordinates of the starting cell - x1, y1:");
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
        } while (x1 < 1 || y1 < 0 || x1 > 8 || y1 >8);

        do {
            System.out.println("Please input coordinates of the finish cell - x2, y2:");
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
        } while (x2 < 1 || y2 < 0 || x2 > 8 || y2 >8);


        boolean result1 = ChessPiecesLogic.checkRookStep(x1, y1, x2, y2);
        String msg1 = result1 ? "yes, rook can get to the second cell in one move" :
                "no, rook can't get to the second cell in one move";
        Printer.print(msg1);

        System.out.println();

        boolean result2 = ChessPiecesLogic.checkChessKing(x1, y1, x2, y2);
        String msg2 = result2 ? "yes, king can get to the second cell in one move":
                "no, king can't get to the second cell in one move";
        Printer.print(msg2);

        System.out.println();

        boolean result3 = ChessPiecesLogic.checkChessElephant(x1, y1, x2, y2);
        String msg3 = result3 ? "elephant can get to the second cell in one move" :
                "no, elephant can't get to the second cell in one move";
        Printer.print(msg3);

        System.out.println();

        boolean result4 = ChessPiecesLogic.checkChessQueen(x1, y1, x2, y2);
        String msg4 = result4 ? "yes, queen can get to the second cell in one move" :
                "no, queen can't get to the second cell in one move";
        Printer.print(msg4);

        System.out.println();

        boolean result5 = ChessPiecesLogic.checkChessKnight(x1, y1, x2, y2);
        String msg5 = result5 ? "yes, knight can get to the second cell in one move" :
                "no, knight can't get to the second cell in one move";
        Printer.print(msg5);

        scanner.close();

    }

}
