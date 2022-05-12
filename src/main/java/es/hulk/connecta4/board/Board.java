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

    public boolean uncoverBox(int column, Player player) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][column].isEmpty()) {
                board[i][column].setEmpty(false);
                board[i][column].setColor(player.getColor());
                return true;
            }
        }
        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isWining() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    continue;
                }
                if (j + 3 < columns) {
                    if (board[i][j].getColor() == board[i][j + 1].getColor() &&
                            board[i][j].getColor() == board[i][j + 2].getColor() &&
                            board[i][j].getColor() == board[i][j + 3].getColor()) {
                        return true;
                    }
                }
            }
        }
        // vertical
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    continue;

                } else if (i + 3 < rows) {
                    if (board[i][j].getColor() == board[i + 1][j].getColor() &&
                            board[i][j].getColor() == board[i + 2][j].getColor() &&
                            board[i][j].getColor() == board[i + 3][j].getColor()) {
                        return true;
                    }
                }
            }
        }
        // diagonal right
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    continue;
                } else if (i + 3 < rows && j + 3 < columns) {
                    if (board[i][j].getColor() == board[i + 1][j + 1].getColor() &&
                            board[i][j].getColor() == board[i + 2][j + 2].getColor() &&
                            board[i][j].getColor() == board[i + 3][j + 3].getColor()) {
                        return true;
                    }
                }
            }
        }
        // diagonal left
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (board[i][j].isEmpty()) {
                    continue;
                } else if (i + 3 < rows && j - 3 >= 0) {
                    if (board[i][j].getColor() == board[i + 1][j - 1].getColor() &&
                            board[i][j].getColor() == board[i + 2][j - 2].getColor() &&
                            board[i][j].getColor() == board[i + 3][j - 3].getColor()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
