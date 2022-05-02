package es.hulk.connecta4;

import es.hulk.connecta4.board.Board;
import es.hulk.connecta4.menus.MainMenu;

public class Connecta4 {

    private static Board board;
    private static MainMenu menu;

    public void main(String[] args) {
        menu = new MainMenu(this);
    }

}
