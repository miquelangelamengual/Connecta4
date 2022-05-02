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

    public void getBoardMenu() {
        logNewLine("1 - Tablero normal (7x6)");
        logNewLine("2 - Tablero personalizado");
        logNewLine("");
        logNewLine("Elige una opción: ");
    }

    public String SELECT_PLAYER_COUNT = "Select the number of players: ";
    public String SELECT_PLAYER_NAMES = "Select the name of the player ";
    public String SELECT_PLAYER_COLOR = "Select the color of the player ";


}
