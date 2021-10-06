package com.saggezza.cannon_game;

public class DisplayStats implements IDisplayStats{
    public void displayStats(IPlayer player) {
        System.out.println("Player name:  " + player.getName());
        System.out.println("Best score:   " + player.getBestScore());
        System.out.println("Worst score:  " + player.getWorstScore());
        System.out.println("Ave. score:   " + player.getAverageScore());
        System.out.println("Games played: " + player.getGamesPlayed());
    }
}
