package models;

public class LadderMove extends Move {
    Integer start;
    Integer end;

    LadderMove(ElementType elementType) {
        super(elementType);
    }

    @Override
    public Integer getPos() {
        return end;
    }

    @Override
    public Boolean setMove(Integer start, Integer end) {
        if (end <= start) {
            return false;
        } else {
            this.start = start;
            this.end = end;
        }
        return true;
    }
}
