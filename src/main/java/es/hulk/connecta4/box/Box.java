package es.hulk.connecta4.box;

import es.hulk.connecta4.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Box {

    private boolean isEmpty;
    private char color;
    private Player player;

    public Box(int x, int j) {
        this.isEmpty = true;
        this.color = player.getColor();
    }
}
