package models;

import java.util.Random;

public class Dice {
    public int rollDice() {
        Random random = new Random();
        return 1+random.nextInt(6);
    }
}
