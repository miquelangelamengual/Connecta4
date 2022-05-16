package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.ErrorCatching;
import es.hulk.connecta4.utils.Text;

public class ElectionMenu {

    private final MainMenu menu = Connecta4.getMenu();
    private final Board board = menu.getBoard();

    public ElectionMenu() {
        this.putIntoBoard();
    }

    public void putIntoBoard() {
        for (Player player : PlayerManager.getPlayerList()) {
            System.out.println(player.getName() + " turn");
            board.uncoverBox(ErrorCatching.returnParseInt(true), player);

            if (board.isDraw()) Text.printDraw();
            if (board.isWining()) Text.printWin(player);

            if (!board.isDraw() && !board.isWining()) this.putIntoBoard();
        }
    }
}