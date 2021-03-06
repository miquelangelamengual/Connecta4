package es.hulk.connecta4.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
    private String name;
    private String color;
    private boolean isWinner;

    public Player(String name, String color) {
        this.name = name;
        this.color = color.substring(0, 1).toUpperCase();
        this.isWinner = false;
    }
}
