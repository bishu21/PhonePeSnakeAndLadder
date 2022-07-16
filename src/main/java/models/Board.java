package models;

import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
public class Board {
    List<Cell> cells;

    public List<Cell> getCells() {
        return cells;
    }

    public Board(List<Cell> cells) {
        this.cells = cells;
    }
}
