package com.saggezza.cannon_game;

import org.junit.Test;

import static org.junit.Assert.*;

public class UpdateBestScoreTest {

    @Test
    public void bestScoreReplaced() {
        //Given: I have the best score of 4.
        // And: I have new score of 2.
        int bestScore = 4;
        int newScore = 2;

        IUpdateBestScore scoreUpdate = new UpdateBestScore();
        //When: I update my best score.
        int result = scoreUpdate.computeBestScore(bestScore, newScore);

        //Then: my best score will be 2.
        assertEquals(2, result);
    }

    @Test
    public void bestScoreNotReplaced() {
        //Given: I have the best score of 4.
        // And : I have the new score of 6.

        int bestScore = 4;
        int newScore = 6;

        IUpdateBestScore scoreUpdate = new UpdateBestScore();

        // When: I update my best score
        int result = scoreUpdate.computeBestScore(bestScore, newScore);

        // Then: my best score is 4
        assertEquals(4, result);
    }
}
