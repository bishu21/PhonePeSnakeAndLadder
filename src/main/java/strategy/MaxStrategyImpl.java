package strategy;

import models.Dice;

public class MaxStrategyImpl implements Strategy {
    Dice dice;

    public MaxStrategyImpl(Dice dice) {
        this.dice = dice;
    }

    @Override
    public Integer getValue(Integer numOfDice) {
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<numOfDice;i++) ans = Math.max(ans, dice.rollDice());
        return ans;
    }
}
