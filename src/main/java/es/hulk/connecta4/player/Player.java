package es.hulk.connecta4.player;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {

    private String name;
    private String color;
    private boolean isPlaying;

    public Player(String name, String color) {
        this.name = name;
        this.color = color;
        this.isPlaying = false;
    }
}
