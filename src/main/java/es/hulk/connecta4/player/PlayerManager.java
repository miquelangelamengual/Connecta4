package es.hulk.connecta4.player;

import es.hulk.connecta4.utils.Text;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

    @Getter private static List<Player> playerList = new ArrayList<>();

    public static void addPlayer(Player player) {
        player.setId(playerList.size() + 1);
        playerList.add(player);
    }

    public static void removePlayer(Player player) {
        playerList.remove(player);
    }

    public static void removeAllPlayers() {
        playerList.clear();
    }

    public static Player getPlayerByName(String name) {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public static String getPlayerByColor() {
        for (Player player : playerList) {
            return String.valueOf(player.getColor().charAt(0));
        }
        return null;
    }

    public static Player getPlayerByID(String id) {
        for (Player player : playerList) {
            if (player.getId() == Integer.parseInt(id)) {
                return player;
            }
        }
        return null;
    }

    public static void createPlayers(int numPlayers) {
        for (int i = 0; i < numPlayers; i++) {

            System.out.print(Text.SELECT_PLAYER_NAMES + (i + 1) + ": ");
            String name = Text.readString();

            System.out.print(Text.SELECT_PLAYER_COLOR + (i + 1) + ": (TIENE QUE SER UN CARACTER) ");
            String color = Text.readString();

            PlayerManager.addPlayer(new Player(name, color));
        }
    }
}
