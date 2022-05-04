package es.hulk.connecta4.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {

    private String name;
    private char color;
    private boolean isPlaying;

    public Player(String name, char color) {
        this.name = name;
        this.color = color;
        this.isPlaying = false;
    }
}
