package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Player {
    Integer id;
    Integer position;
    Status status;
    public enum Status {
        WIN, LOSE, PENDING
    }
}
