package es.hulk.connecta4.board;

import es.hulk.connecta4.box.Box;

public class Board {

    private Box[][] board;

    public Board() {
        this.board = new Box[6][7];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = new Box(i, j);
            }
        }
    }
}
