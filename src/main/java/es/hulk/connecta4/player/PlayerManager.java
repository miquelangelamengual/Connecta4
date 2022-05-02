package es.hulk.connecta4.player;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class PlayerManager {

    @Getter private static List<Player> playerList = new ArrayList<>();

    public static void addPlayer(Player player) {
        playerList.add(player);
    }

    public static void removePlayer(Player player) {
        playerList.remove(player);
    }

    public static void removeAllPlayers() {
        playerList.clear();
    }

    public static Player getPlayer(String name) {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public static Player getPlayerByName(String name) {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }
}
