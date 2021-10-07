package com.saggezza.cannon_game;

public class UpdateFlow implements IUpdateFlow {

    private final IPlayerData playerData;
    private final IUpdateBestScore updateBest;

    public UpdateFlow(IPlayerData playerData, IUpdateBestScore updateBest) {
        this.playerData = playerData;
        this.updateBest = updateBest;
    }


    public void updatePlayer(String name, int score) {
        int bestScore = playerData.getPlayerBestScore(name);
        int worstScore = playerData.getPlayerWorstScore(name);
        double averageScore = playerData.getPlayerAverageScore(name);
        int gamesPlayed = playerData.getPlayerGamesPlayed(name);
        int newBestScore = updateBest.computeBestScore(bestScore, score);
    }
}
