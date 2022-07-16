package service;

import models.ElementType;
import strategy.Strategy;

public interface GameService {

    Boolean addPlayers(Integer numOfPlayers);

    Boolean addBoardSize(Integer size);

    Boolean addElements(Integer start, Integer end, ElementType type);

    Boolean numOfDice(Integer dices);

    Boolean beginGame();

    void addStrategy(Strategy strategy);

}
