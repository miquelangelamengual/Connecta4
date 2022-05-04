package es.hulk.connecta4.menus;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.Player;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MainMenu {

    private Board board;
    private Text text = Connecta4.getUtils().getText();
    public MainMenu() {
        this.selectPlayerName();
    }

    public void selectPlayerName() {
        System.out.print(text.SELECT_PLAYER_COUNT);
        int numPlayers = text.readInt();
        createPlayers(numPlayers);
        this.selectBoard();
    }

    private void selectBoard() {
        text.getBoardMenu();
        int option = text.readInt();
        switch (option) {
            case 1:
                generateBoard(6, 7);
                break;
            case 2:
                System.out.print(text.CUSTOM_BOARD_ROW);
                int row = text.readInt();

                System.out.print(text.CUSTOM_BOARD_COLUMN);
                int column = text.readInt();

                generateBoard(row, column);
        }
    }

    private void createPlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {

            System.out.print(text.SELECT_PLAYER_NAMES + (i + 1) + ": ");
            String name = text.readString();

            System.out.print(text.SELECT_PLAYER_COLOR + (i + 1) + ": ");
            char color = text.readChar();

            PlayerManager.addPlayer(new Player(name, color));
        }
    }

    private void generateBoard(int x, int y) {
        this.board = new Board(x, y);
        this.board.printBoard();
    }
}
