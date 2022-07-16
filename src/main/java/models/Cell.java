package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cell {

    private Move move;

    public void setMove(Integer start, Integer end, ElementType type) {
        this.move = switch (type) {
            case SNAKE -> new SnakeMove(type);
            case LADDER -> new LadderMove(type);
            default -> null;
        };
        if (this.move != null)
            this.move.setMove(start, end);
    }

}