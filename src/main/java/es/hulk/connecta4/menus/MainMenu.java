package es.hulk.connecta4.menus;

import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainMenu {

    private Board board;

    public MainMenu() {
        this.selectPlayerName();
    }

    public void selectPlayerName() {
        System.out.print(Text.SELECT_PLAYER_COUNT);
        int numPlayers = Text.readInt();
        createPlayers(numPlayers);
    }

    private void createPlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {

            System.out.print(Text.SELECT_PLAYER_NAMES + (i + 1) + ": ");
            String name = Text.readString();

            System.out.println(Text.SELECT_PLAYER_COLOR + (i + 1) + ": ");
            String color = Text.readString();

            PlayerManager.addPlayer(new Player(name, color));
        }
    }

    private void generateBoard(int x, int y) {
        this.board = new Board(x, y);
    }
}
