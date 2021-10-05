package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GettingFinalXCoordinateTest {

    @Test
    public void gettingFinalXCoordinateTest(){

        //Given: I have a degree of 0.78 and a velocity of 10

        double degree= 0.78;
        int velocity= 10;


        // When I need to calculate the final x coordinate I pass the degree and velocity into the cosine function

          IGettingFinalXCoordinate finalx = new GettingFinalXCoordinate();
          double result = finalx.gettingFinalXCoordinate(0.78,10);



        // Then: I  get back 7.10

        assertEquals(7.10,result,0.01);

    }

}
