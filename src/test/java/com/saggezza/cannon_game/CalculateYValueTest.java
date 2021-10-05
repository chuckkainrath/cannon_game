package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateYValueTest {
    @Test
//Given degree 0.78 and velocity 10 - Updated
    public void ValueOfY(){
        double degree =  0.78;
      double velocity = 10;
//when I calculate Y value
      ICalculateYValue calY=new CalculateYValue();
      double Y=calY.YValue(degree,velocity);
      //Then I would pass the degree and velocity into the sine function and get back 7.03
assertEquals(7.03,Y,0.01);
    }

@Test
        //Given degree 0.523 and velocity 15
        public void ValueOfY1(){
            double degree =  0.523;
            double velocity=15;
//when I calculate Y value
            ICalculateYValue calY=new CalculateYValue();
            double Y=calY.YValue(degree,velocity);
           // Then would pass the degree and velocity into the sine function and get back 7.49
            assertEquals(7.49,Y,0.01);

        }


    @Test
    //Given degree 1.57 and velocity 19.5
    public void ValueOfY2(){
        double degree =  1.57;
        double velocity =19.2;
//when I calculate Y value
        ICalculateYValue calY=new CalculateYValue();
        double Y=calY.YValue(degree,velocity);
        //then would pass the degree and velocity into the sine function and get back 19.19
        assertEquals(19.19,Y,0.01);

    }

}
