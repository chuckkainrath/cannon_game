package com.saggezza.cannon_game;
import org.junit.Test;

import static org.junit.Assert.*;


public class UpdateAverageScoreTest {

    @Test
    public void testUpdatedAverage(){
       //Given: I have the average of 4.
        double avgScore = 4;

        //And: I have played 10 games.
        int numberOfGames = 10;

        //And: I have new score of 5.
        int newScore = 5;

        IUpdateAverageScore updatedAverage = new UpdateAverageScore();

        //When: I update the average.
        double avgResult = updatedAverage.computeAverageScore(avgScore, numberOfGames, newScore);

        //Then: my new average is 4.09.
        assertEquals(4.09, avgResult, .01 );

    }
}
