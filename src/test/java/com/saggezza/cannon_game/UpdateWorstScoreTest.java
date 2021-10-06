package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateWorstScoreTest {

    @Test
    public void updateWorstScoreWhenNecessary() {
//        Given: I have the worst score of 4.
//        And: I scored 2.
        int worstScore = 2;
        int newScore = 4;

//        When: I update my worst score.

        IUpdateWorstScore updateWorstScore = new UpdateWorstScore();
        int newWorstScore = updateWorstScore.computeWorstScore(worstScore, newScore);
//        Then: my worst score will be 4.
        assertEquals(4,newWorstScore);
    }

    @Test
    public void updateWorstScoreWhenNotNecessary() {
//        Given: I have the worst score of 4.
//        And: I scored 2.
        int worstScore = 4;
        int newScore = 2;

//        When: I update my worst score.

        IUpdateWorstScore updateWorstScore = new UpdateWorstScore();
        int newWorstScore = updateWorstScore.computeWorstScore(worstScore, newScore);
//        Then: my worst score will be 4.
        assertEquals(4,newWorstScore);
    }
}
