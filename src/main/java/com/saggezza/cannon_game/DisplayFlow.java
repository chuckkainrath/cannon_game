package com.saggezza.cannon_game;

public class DisplayFlow implements IDisplayFlow {
    private final IPlayerData playerData;

    //constructor
    public DisplayFlow(IPlayerData playerData){
        this.playerData = playerData;
    }

    public void leaderBoard(String name){
        int bestScore = playerData.getPlayerBestScore(name);
        int worstScore = playerData.getPlayerWorstScore(name);
        double avgScore = playerData.getPlayerAverageScore(name);
        int numGames = playerData.getPlayerGamesPlayed(name);
        System.out.println("Hey " + name + "!");
        System.out.println("Here are your stats!");
        System.out.println("Your best score was " + bestScore);
        System.out.println("Your worst score was " + worstScore);
        System.out.println("The number of games you played is "+ numGames);
        System.out.println("Your average score is "+ avgScore);
        System.out.println("Keep on keepin' on!!");

    }
}
