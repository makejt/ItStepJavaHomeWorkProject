package by.itstep.makejt.javastages.stage12.task01.model.logic;

public class ChessPiecesLogic {

    public static boolean checkRookStep(int x1, int y1, int x2, int y2) {
        return (x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2);
    }


    public static boolean checkChessKing(int x1, int y1, int x2, int y2) {
        return (x1 == x2 || x1 - x2 == 1 || x2 - x1 == 1) &&
                (y1 == y2 || y1 - y2 == 1 || y2 - y1 == 1);
    }

    public static boolean checkChessElephant (int x1, int y1, int x2, int y2) {
        return (x1 - x2 == y1 - y2) || (x2 - x1 == y2 - y1) ||
                (x1 - x2 == y2 - y1) || (x2 - x1 == y1 - y2);
    }

    public static boolean checkChessQueen (int x1, int y1, int x2, int y2) {
        return checkRookStep(x1, y1, x2, y2) || checkChessKing(x1, y1, x2, y2) ||
                checkChessElephant(x1, y1, x2, y2);
    }

    public static boolean checkChessKnight (int x1, int y1, int x2, int y2) {
        return (x1 - x2 == 1 || x2 - x1 == 1 && y1 - y2 == 2 || y2 - y1 == 2) ||
                (x1 - x2 == 2 || x2 - x1 == 2 && y1 - y2 == 1 || y2 - y1 == 1);
    }

}
