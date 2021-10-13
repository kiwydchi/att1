package edu.csf.oop.java.greatchess.game;

public class GUI {
    public void printBoard(char[][] boxes) {
        System.out.println("   _____________________");
        for (int i = 0; i < boxes.length; i++) {
            if (i == 0) {
                System.out.print((10 - i)+ "| ");
            }
            else {
                System.out.print((10 - i)+ " | ");
            }
            for (int j = 0; j < boxes[i].length; j++) {
                if (boxes[i][j] == ' ') {
                    System.out.print(":");
                } else {
                    System.out.print(boxes[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("   _____________________");
        System.out.println("    a b c d e f g h i j");
    }
}
