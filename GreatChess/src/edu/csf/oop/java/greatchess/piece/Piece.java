package edu.csf.oop.java.greatchess.piece;

import edu.csf.oop.java.greatchess.Board;

public abstract class Piece {
    private boolean onBoard = true;
    private int set;

    public Piece(int set){
        this.set = set;
    }

    public int getSet(){
        return this.set;
    }

    public void setOnBoard(boolean onBoard) {
        this.onBoard = onBoard;
    }

    public abstract boolean canMove(Board board, String start, String end);
}
