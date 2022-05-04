package es.hulk.connecta4.board;

import es.hulk.connecta4.box.Box;

public class Board {

    private int rows;
    private int columns;
    private Box[][] board;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.board = new Box[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                this.board[i][j] = new Box(i, j);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    System.out.print(" [   ] ");
                } else if (board[i][j].getColor() == ' ') {
                    System.out.print(" [   ] ");
                } else {
                    System.out.print(" [ " + this.board[i][j].getColor() + " ] ");
                }
            }
            System.out.println();
        }
    }
}
