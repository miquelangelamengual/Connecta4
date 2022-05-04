package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;

public class ElectionMenu {

    private MainMenu menu = Connecta4.getMenu();
    private Board board = menu.getBoard();

    public ElectionMenu() {
        this.putIntoBoard();
    }

    public void putIntoBoard() {
        for (Player player : PlayerManager.getPlayerList()) {
            System.out.println(player.getName() + " tourn");
            int x = Text.readInt();
            int y = Text.readInt();

            if (board.getBoard()[x][y].isEmpty()) {
                board.getBoard()[x][y].setEmpty(false);
                board.getBoard()[x][y].setColor(player.getColor());
                board.printBoard();
            } else {
                System.out.println(Text.POSITION_BUSY);
            }
        }
        this.putIntoBoard();
    }

}