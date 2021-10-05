package com.saggezza.cannon_game;

import java.util.Random;

public class Target implements ITarget {

    public int xTarget;
    public int yTarget;

    public int getxTarget() {
        return xTarget;
    }

    public int getyTarget() {
        return yTarget;
    }

    public void createTarget() {
        Random random = new Random();
        this.xTarget = random.nextInt(10) + 1;
        this.yTarget = random.nextInt(10) + 1;
    }
}
