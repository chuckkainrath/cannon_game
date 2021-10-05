package com.saggezza.cannon_game;

public class CalculateYValue implements ICalculateYValue {

       public double YValue(double degree,double velocity){
           double result= Math.sin(degree)*velocity;
           return result;


       }


}
