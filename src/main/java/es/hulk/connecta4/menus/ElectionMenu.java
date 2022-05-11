package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;

import java.util.Scanner;

public class ElectionMenu {

    private MainMenu menu = Connecta4.getMenu();
    private Board board = menu.getBoard();

    public ElectionMenu() {
        this.putIntoBoard();
    }

    public void putIntoBoard() {
        Scanner scanner = new Scanner(System.in);
        for (Player player : PlayerManager.getPlayerList()) {
            System.out.println(player.getName() + " tourn");
            int column = scanner.nextInt();
            board.uncover(column, player);
            board.printBoard();
        }

        this.putIntoBoard();
    }
}