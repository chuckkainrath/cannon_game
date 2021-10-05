package com.saggezza.cannon_game;

public class GettingFinalXCoordinate implements IGettingFinalXCoordinate {


    public double gettingFinalXCoordinate(double degree, double velocity) {

        return Math.cos(degree) * velocity;

    }

}