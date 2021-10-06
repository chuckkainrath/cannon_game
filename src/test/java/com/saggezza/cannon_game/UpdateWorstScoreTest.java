package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UpdateWorstScoreTest {

    @Test
    public void worstScoreReplaced() {

        //Given: I have the worst score of 4.
        // And: I scored 2.

        int worstScore = 4;
        int newScore = 2;

        IUpdateWorstScore scoreUpdate = new UpdateWorstScore();
        //When: I update my worst score.
        int result = scoreUpdate.computeWorstScore(worstScore, newScore);

        //Then: my worst score will be 2.
        assertEquals(2, result);

    }
}
