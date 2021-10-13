package edu.csf.oop.java.greatchess.game;

import edu.csf.oop.java.greatchess.Board;
import edu.csf.oop.java.greatchess.Player;

public class Game {
    public enum GameStatus {
        ACTIVE,
        BLACK_WIN,
        WHITE_WIN,
        STALEMATE
    }

    private Player[] players;
    private Board board;
    private GameStatus status;

    public void initialize() {
        Board board = new Board();
        GUI gui = new GUI();
        gui.printBoard(board.getBoxes());
    }
}
