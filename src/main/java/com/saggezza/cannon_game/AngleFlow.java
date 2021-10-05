package com.saggezza.cannon_game;

import java.util.Scanner;

public class AngleFlow implements IAngleFlow {

    private IAngleV _Angle1;

    public AngleFlow(IAngleV Angle1) {
        _Angle1 = Angle1;
    }

    public double getAngle() {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter an angle between 1 - 90:");
        double result = reader.nextDouble();

        while (!_Angle1.validate(result)) {
            System.out.println("Enter an angle between 1 - 90:");
            result = reader.nextDouble();
        }
        return result;
    }

}
