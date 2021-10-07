package com.saggezza.cannon_game;

public class UpdateFlow implements IUpdateFlow {

    private IPlayerData playerData;
    public UpdateFlow(IPlayerData playerData) {
        this.playerData = playerData;
    }


    public void updatePlayer(String name, int score) {
        playerData.getPlayerBestScore(name); 

    }
}
