package es.hulk.connecta4;

import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.menus.MainMenu;
import es.hulk.connecta4.utils.Utils;
import lombok.Getter;

public class Connecta4 {

    @Getter private static Board board;
    @Getter private static MainMenu menu;
    @Getter private static Utils utils = new Utils();

    public static void main(String[] args) {
        menu = new MainMenu();
        board = menu.getBoard();
    }

}
