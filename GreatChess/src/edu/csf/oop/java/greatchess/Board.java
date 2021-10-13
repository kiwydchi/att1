package edu.csf.oop.java.greatchess;

public class Board {
    char[][] boxes;

    public Board() {
        this.boxes = new char[10][10];
        this.resetBoard();
    }

    public char[][] getBoxes() {
        return boxes;
    }
    
    /*
    P/p - пешка
    R/r - ладья
    H/h - конь
    B/b - слон
    W/w - боевая машина
    V/v - визирь
    G/g - жираф
    K/k - король
    Q/q - ферзь
    */

    public void resetBoard() {
        for (int i = 0; i < 10; i++) {
            if (i == 4 || i == 5) {
                boxes[2][i] = 'p';
                boxes[7][i] = 'P';
            }
            else {
                boxes[1][i] = 'p';
                boxes[8][i] = 'P';
            }
        }
        boxes[9][0] = 'R';
        boxes[9][9] = 'R';
        boxes[0][0] = 'r';
        boxes[0][9] = 'r';

        boxes[9][1] = 'H';
        boxes[9][8] = 'H';
        boxes[0][1] = 'h';
        boxes[0][8] = 'h';

        boxes[9][2] = 'B';
        boxes[9][7] = 'B';
        boxes[0][2] = 'b';
        boxes[0][7] = 'b';

        boxes[8][4] = 'W';
        boxes[8][5] = 'W';
        boxes[1][4] = 'w';
        boxes[1][5] = 'w';

        boxes[9][3] = 'V';
        boxes[9][4] = 'G';
        boxes[9][5] = 'K';
        boxes[9][6] = 'Q';
        boxes[0][6] = 'v';
        boxes[0][5] = 'g';
        boxes[0][4] = 'k';
        boxes[0][3] = 'q';

        for (int i = 2; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                if (!(i == 2 && (j == 4 || j == 5) || i == 7 && (j == 4 || j == 5))) {
                    boxes[i][j] = ' ';
                }
            }
        }
    }
}
