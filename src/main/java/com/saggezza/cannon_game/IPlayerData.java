package com.saggezza.cannon_game;

public interface IPlayerData {
    boolean playerExists(String name);
    int getPlayerBestScore(String name);
    int getPlayerWorstScore(String name);
    double getPlayerAverageScore(String name);
    int getPlayerGamesPlayed(String name);
    void createPlayer(String name, int bestScore, int worstScore, int gamesPlayed, double aveScore);
    void updatePlayer(String name, int bestScore, int worstScore, int gamesPlayed, double aveScore);
}
