package com.saggezza.cannon_game;

public class UpdateWorstScore implements IUpdateWorstScore{

    public int computeWorstScore(int worstScore, int newScore) {
        if (worstScore < newScore) {
            worstScore = newScore;
        }
        return worstScore;
    }
}
