package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.ErrorCatching;
import es.hulk.connecta4.utils.Text;

public class ElectionMenu {

    private MainMenu menu = Connecta4.getMenu();
    private Board board = menu.getBoard();

    public ElectionMenu() {
        this.putIntoBoard();
    }

    public void putIntoBoard() {
        selectTurn();

        if (board.isDraw()) {
            Text.printDraw();
            System.exit(404);
        }

        if (board.isWining()) {
            Text.printWin();
            System.exit(404);
        }

        if (!board.isDraw() && !board.isWining()) {
            this.putIntoBoard();
        }

    }

    public void selectTurn() {
        for (Player player : PlayerManager.getPlayerList()) {
            System.out.println(player.getName() + " turn");
            board.uncoverBox(ErrorCatching.returnParseInt(true), player);
            if (board.isWining() || board.isDraw()) break;
            board.printBoard();
        }
    }
}