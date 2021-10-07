package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class UpdateFlowTest {

    @Test
    public void getBestCalledOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData);
        updateFlow.updatePlayer(name, score);

        //Then: each of the getBestScore method is called once.
        verify(playerData, times(1)).getPlayerBestScore(name);
    }
}
