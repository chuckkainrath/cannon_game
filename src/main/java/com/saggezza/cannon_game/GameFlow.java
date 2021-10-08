package com.saggezza.cannon_game;

public class  GameFlow implements IGameFlow {

    private IShotFlow shotFlow;
    private ITarget target;

    public GameFlow(IShotFlow shotFlow, ITarget target){
        this.shotFlow=shotFlow;
        this.target = target;
    }

    public int playGame() {
        int attempt = 1;
        target.createTarget();

        System.out.println("The target is at x: " + target.getxTarget() + ", y: " + target.getyTarget());

        while (!shotFlow.shoot(target.getxTarget(), target.getyTarget())) {
            attempt++;

        }
        System.out.println("You hit the target on the "+ attempt+ " attempt");
        return attempt;
    }

}
