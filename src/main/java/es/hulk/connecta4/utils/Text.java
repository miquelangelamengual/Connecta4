package es.hulk.connecta4.utils;

import lombok.experimental.UtilityClass;

import java.util.Scanner;

@UtilityClass
public class Text {

    private final Scanner scanner = new Scanner(System.in);

    public void logNewLine(String str) {
        System.out.println(str);
    }

    public void log(String str) {
        System.out.print(str);
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public String readString() {
        return scanner.next();
    }

    public char readChar() {
        return scanner.next().charAt(0);
    }

    public void getBoardMenu() {
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

    public String SELECT_PLAYER_NAMES = "Selecciona el nombre del jugador ";
    public String SELECT_PLAYER_COLOR = "Selecciona el color de la ficha del jugador ";
    public String CUSTOM_BOARD_ROW = "Seleccione el numero de filas: ";
    public String CUSTOM_BOARD_COLUMN = "Seleccione el numero de columnas: ";
    public String POSITION_BUSY = "Esta posicion esta ocupada, prueba con otra";

}
