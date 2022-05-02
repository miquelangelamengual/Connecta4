package es.hulk.connecta4.box;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Box {

    private boolean isEmpty;
    private String color;

    public Box(int x, int j) {
        this.isEmpty = true;
        this.color = "";
    }
}
