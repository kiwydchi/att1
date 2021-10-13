package edu.csf.oop.java.greatchess.piece;

import edu.csf.oop.java.greatchess.Board;

public class Bishop extends Piece {
    public Bishop(int set) {
        super(set);
    }

    @Override
    public boolean canMove(Board board, String start, String end) {
        int startX = start.charAt(0) - 97;
        int startY = start.charAt(1);
        int endX = end.charAt(0) - 97;
        int endY = end.charAt(1);

        if (Math.abs(startX - endX) == Math.abs(startY - endY)) {
            return true;
        }
        return false;
    }
}
