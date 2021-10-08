package com.saggezza.cannon_game;

public class PostGameFlow implements IPostGameFlow {
    private IPlayerData playerData;
    private IUpdateFlow updateflow;
    private IDisplayFlow displayFlow;

    public PostGameFlow(IPlayerData playerdata, IUpdateFlow updateFlow, IDisplayFlow displayFlow) {
        this.playerData = playerdata;
        this.updateflow = updateFlow;

    }

    public void postGame(String name, int score) {

        if (playerData.playerExists(name)) {
            updateflow.updatePlayer(name, score);


        } else {
            playerData.createPlayer(name, score, score, 1, score);

        }
        displayFlow.leaderBoard(name);


    }
}
