package es.hulk.connecta4.board;

import es.hulk.connecta4.box.Box;
import es.hulk.connecta4.player.Player;
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
                System.out.print(this.board[i][j].toString());
            }
            System.out.println();
        }
    }

    public boolean uncover(int column, Player player) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][column].isEmpty()) {
                board[i][column].setEmpty(false);
                board[i][column].setColor(player.getColor());
                return true;
            }
        }
        return false;
    }
}
