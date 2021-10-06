package com.saggezza.cannon_game;

public class UpdateBestScore implements IUpdateBestScore {

    public int computeBestScore(int bestScore, int newScore) {

        if (bestScore > newScore) {
            return newScore;
        }
        return bestScore;
    }
}
