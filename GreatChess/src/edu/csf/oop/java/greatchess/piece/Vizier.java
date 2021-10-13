package edu.csf.oop.java.greatchess.piece;

import edu.csf.oop.java.greatchess.Board;

public class Vizier extends Piece {
    public Vizier(int set) {
        super(set);
    }

    @Override
    public boolean canMove(Board board, String start, String end) {
        int startX = start.charAt(0) - 97;
        int startY = start.charAt(1);
        int endX = end.charAt(0) - 97;
        int endY = end.charAt(1);

        int x = Math.abs(startX - endX);
        int y = Math.abs(startY - endY);

        if (x == y || x * y == 2) {
            return true;
        }
        return false;
    }
}
