package com.saggezza.cannon_game;

public class UpdateAverageScore implements IUpdateAverageScore{

    public double computeAverageScore(double avgScore, int numberOfGames, int newScore) {
       double totalScore = avgScore * numberOfGames + newScore;
       double newAverage = totalScore / (numberOfGames + 1);
         return newAverage;

    }

}
