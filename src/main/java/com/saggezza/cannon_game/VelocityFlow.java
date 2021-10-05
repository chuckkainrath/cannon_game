package com.saggezza.cannon_game;

import java.util.Scanner;

public class VelocityFlow implements IVelocityFlow {

    private IVelocityValidityCheckObj _velocityValidate;

    public VelocityFlow(IVelocityValidityCheckObj velocityValidate) {
        _velocityValidate = velocityValidate;
    }

    public double getVelocity() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an velocity between 1 - 20:");
        double result = reader.nextDouble();
        while (!_velocityValidate.checkVelocity(result)) {
            System.out.println("Enter a velocity between 1 - 20:");
            result = reader.nextDouble();
        }
        return result;
    }
}
