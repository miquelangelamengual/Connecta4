package es.hulk.connecta4.board;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.box.Box;
import lombok.Getter;

@Getter
public class Board {

    private final int rows;
    private final int columns;
    private final Box[][] board;

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
                if (board[i][j].isEmpty() || board[i][j].getColor().isEmpty()) {
                    System.out.print(" [   ] ");
                } else {
                    System.out.print(" [ " + board[i][j].getColor() + " ] ");
                }
            }
            System.out.println();
        }
    }
}
