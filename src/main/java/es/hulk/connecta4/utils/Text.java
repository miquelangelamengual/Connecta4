package es.hulk.connecta4.utils;

import es.hulk.connecta4.Connecta4;
import es.hulk.connecta4.player.Player;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Text {

    public String SELECT_PLAYER_NAMES = "Selecciona el nombre del jugador ";
    public String SELECT_PLAYER_COLOR = "Selecciona el color de la ficha del jugador ";
    public String CUSTOM_BOARD_ROW = "Seleccione el numero de filas: ";
    public String CUSTOM_BOARD_COLUMN = "Seleccione el numero de columnas: ";

    public void logNewLine(String str) {
        System.out.println(str);
    }

    public void log(String str) {
        System.out.print(str);
    }

    public void getBoardMenu() {
        logNewLine("");
        logNewLine("1 - Tablero normal (7x6)");
        logNewLine("2 - Tablero personalizado");
        logNewLine("");
        log("Elige una opción: ");
    }

    public void printPlayerSelection() {
        logNewLine("");
        logNewLine("Bienvenido al juego Connecta 4");
        logNewLine("");
        logNewLine("A continuacion, selecciona cuantos jugadores quieres que juegen");
        logNewLine("");
    }

    public void printDraw() {
        logNewLine("");
        logNewLine("La partida ha terminado en empate");
        logNewLine("");
        Connecta4.getBoard().printBoard();
        System.exit(0);
    }

    public void printWin(Player player) {
        logNewLine("");
        logNewLine("El jugador " + player.getName() + " ha ganado");
        logNewLine("");
        Connecta4.getBoard().printBoard();
        System.exit(0);
    }
}
