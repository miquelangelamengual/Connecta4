package es.hulk.connecta4.player;

import es.hulk.connecta4.utils.Text;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerManager {

    @Getter private final static List<Player> playerList = new ArrayList<>();

    public static void addPlayer(Player player) {
        playerList.add(player);
    }


    public static void createPlayers(int numPlayers) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numPlayers; i++) {

            System.out.print(Text.SELECT_PLAYER_NAMES + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print(Text.SELECT_PLAYER_COLOR + (i + 1) + ": (TIENE QUE SER UN CARACTER) ");
            String color = scanner.nextLine();

            PlayerManager.addPlayer(new Player(name, color));
        }
    }
}
