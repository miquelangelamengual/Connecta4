package es.hulk.connecta4.menus;

import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.player.PlayerManager;
import es.hulk.connecta4.utils.Text;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter @Setter
public class MainMenu {

    private Board board;

    public MainMenu() {
        this.selectPlayerName();
    }

    private void selectPlayerName() {
        try {
        Text.printPlayerSelection();
        Scanner scanner = new Scanner(System.in);
        int numPlayers = scanner.nextInt();
        PlayerManager.createPlayers(numPlayers);
        this.selectBoard();
        } catch (Exception e) {
            System.out.println(Text.INVALID_OPTION);
            this.selectPlayerName();
        }
    }

    private void selectBoard() {
        Text.getBoardMenu();
        int option = Text.readInt();
        switch (option) {
            case 1:
                generateBoard(6, 7);
                break;
            case 2:
                System.out.print(Text.CUSTOM_BOARD_ROW);
                int row = Text.readInt();

                System.out.print(Text.CUSTOM_BOARD_COLUMN);
                int column = Text.readInt();

                generateBoard(row, column);
        }
    }

    private void generateBoard(int x, int y) {
        this.board = new Board(x, y);
        this.board.printBoard();
    }
}
