package models;

import lombok.Data;

@Data
public abstract class Move {
    ElementType elementType;
    Move(ElementType elementType) {
        this.elementType = elementType;
    }

    abstract public Integer getPos();

    abstract public Boolean setMove(Integer start, Integer end);
}
