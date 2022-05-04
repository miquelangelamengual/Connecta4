package es.hulk.connecta4.player;

import lombok.Getter;
import lombok.Setter;

import java.util.Locale;

@Getter @Setter
public class Player {

    private String name;
    private String color;
    private boolean isPlaying;

    public Player(String name, String color) {
        this.name = name;
        this.color = String.valueOf(color.charAt(0)).toUpperCase();
        this.isPlaying = false;
    }
}
