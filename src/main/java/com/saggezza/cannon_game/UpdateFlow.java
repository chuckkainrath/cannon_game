package com.saggezza.cannon_game;

public class UpdateFlow implements IUpdateFlow {

    private final IPlayerData playerData;
    private final IUpdateBestScore updateBest;
    private final IUpdateWorstScore updateWorst;
    private final IUpdateAverageScore updateAverage;

    public UpdateFlow(IPlayerData playerData, IUpdateBestScore updateBest, IUpdateWorstScore updateWorst, IUpdateAverageScore updateAverage) {
        this.playerData = playerData;
        this.updateBest = updateBest;
        this.updateWorst = updateWorst;
        this.updateAverage = updateAverage;

    }


    public void updatePlayer(String name, int score) {
        int bestScore = playerData.getPlayerBestScore(name);
        int worstScore = playerData.getPlayerWorstScore(name);
        double averageScore = playerData.getPlayerAverageScore(name);
        int gamesPlayed = playerData.getPlayerGamesPlayed(name);
        int newBestScore = updateBest.computeBestScore(bestScore, score);
        int newWorstScore = updateWorst.computeWorstScore(worstScore, score);
        double newAverageScore = updateAverage.computeAverageScore(averageScore, gamesPlayed, score);
        int newGamesPlayed = gamesPlayed + 1;
        playerData.updatePlayer(name, newBestScore, newWorstScore, newGamesPlayed, newAverageScore);
    }
}
