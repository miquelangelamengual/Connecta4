package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;

public class MainMenu {

    private Board board;
    private Connecta4 connecta4;

    public void selectPlayerName() {
        System.out.print(Text.SELECT_PLAYER_COUNT);
        int numPlayers = Text.readInt();
        createPlayers(numPlayers);
    }

    public void createPlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {
            System.out.print(Text.SELECT_PLAYER_NAMES + (i + 1) + ": ");
            String name = Text.readString();
            PlayerManager.getPlayerList().add(new Player(name));
        }
        displayPlayers();
    }

    private void displayPlayers() {
        for (Player player : PlayerManager.getPlayerList()) {
            System.out.println(player.getName());
        }
    }
}
