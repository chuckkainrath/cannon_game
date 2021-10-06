package com.saggezza.cannon_game;

public class PostGameFlow implements IPostGameFlow {

    private IDatabase db;
    private IDisplayStats display;

    public PostGameFlow(IDatabase db, IDisplayStats display) {
        this.db = db;
        this.display = display;
    }

    public void postGame(String name, int score) {
        IPlayer player = db.searchForPlayer(name);
        if (!player) {
            player = new Player(name, score);
        }
        player.updateScore(score);
        db.savePlayer(player);
        display.displayStats(player);
    }
}
