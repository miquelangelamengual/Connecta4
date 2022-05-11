package es.hulk.connecta4.box;

import es.hulk.connecta4.player.Player;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box {

    private boolean isEmpty;
    private String color;
    private Player player;

    public Box(int x, int j) {
        this.isEmpty = true;
        if (player == null) return;
        this.color = player.getColor();
    }

    @Override
    public String toString() {
        if (isEmpty() || getColor().isEmpty()) return " [   ] ";
        else return " [ " + getColor() + " ] ";
    }
}
