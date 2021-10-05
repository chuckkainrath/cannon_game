package com.saggezza.cannon_game;

public class AngleV implements IAngleV {

    public boolean validate(double angle) {

        if (angle >= 1.0 && angle <= 90.0) {
            return true;
        } else {
            return false;
        }
    }
}
