package com.saggezza.cannon_game;

public class VelocityValidityCheckObj implements IVelocityValidityCheckObj {

    public boolean checkVelocity(double input) {

        if (input >= 1.0 && input <= 20.0) {

            return true;
        }
        return false;

    }
}
