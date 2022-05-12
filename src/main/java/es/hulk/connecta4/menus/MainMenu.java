package es.hulk.connecta4.menus;

import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.ErrorCatching;
import es.hulk.connecta4.utils.Text;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainMenu {

    private Board board;

    public MainMenu() {
        this.selectPlayerName();
    }

    private void selectPlayerName() {
        Text.printPlayerSelection();
        int numPlayers = ErrorCatching.returnParseInt(false);
        PlayerManager.createPlayers(numPlayers);
        this.selectBoard();
    }

    private void selectBoard() {
        Text.getBoardMenu();
        int option = ErrorCatching.returnChoseInt(0,3);
        switch (option) {
            case 1:
                generateBoard(6, 7);
                break;
            case 2:
                System.out.print(Text.CUSTOM_BOARD_ROW);
                int row = ErrorCatching.returnParseInt(false);

                System.out.print(Text.CUSTOM_BOARD_COLUMN);
                int column = ErrorCatching.returnParseInt(false);

                generateBoard(row, column);
                break;
        }
    }

    private void generateBoard(int x, int y) {
        this.board = new Board(x, y);
        this.board.printBoard();
    }
}
