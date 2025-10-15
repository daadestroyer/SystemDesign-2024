package LLD_Question.SnakerNLadder;

import java.util.Random;

public class Dice {

    // by how many dice we want to play game, that we can decide
    int diceCount;
    int minVal = 1;
    int maxVal = 6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int totalSum = 0;
        int diceUsed = 0;
        while (diceUsed < diceCount) {
            totalSum += new Random().nextInt(6);
            diceUsed++;
        }
        return totalSum;
    }

}
