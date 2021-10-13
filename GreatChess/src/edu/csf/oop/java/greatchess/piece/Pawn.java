package edu.csf.oop.java.greatchess.piece;

import edu.csf.oop.java.greatchess.Board;

public class Pawn extends Piece {
    public Pawn(int set) {
        super(set);
    }

    @Override
    public boolean canMove(Board board, String start, String end) {
        int startX = start.charAt(0) - 97;
        int startY = start.charAt(1);
        int endX = end.charAt(0) - 97;
        int endY = end.charAt(1);

        int y = Math.abs(startY - endY);
        if (startX == endX && ((this.getSet() == 1 && startY - endY == -1) || (this.getSet() == 0 && startY - endY == 1))) {
            return true;
        }
        return false;
    }
}
