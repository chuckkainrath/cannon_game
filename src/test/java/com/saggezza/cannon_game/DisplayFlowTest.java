package com.saggezza.cannon_game;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class DisplayFlowTest {

    @Test
    public void bestScoreTestOnce() {
        //    Given: I am a user
        String name = "Irfa";

        IPlayerData mockPlayerData = mock(IPlayerData.class);


//    When: I display the best score
        when(mockPlayerData.getPlayerGamesPlayed(name)).thenReturn(12);
        when(mockPlayerData.getPlayerAverageScore(name)).thenReturn(4.5);
        when(mockPlayerData.getPlayerBestScore(name)).thenReturn(1);
        when(mockPlayerData.getPlayerWorstScore(name)).thenReturn(7);
        IDisplayFlow flow = new DisplayFlow(mockPlayerData);
        flow.leaderBoard(name);

//    Then: best score method is called once

        verify(mockPlayerData, times(1)).getPlayerBestScore(name);
//

    }

    @Test
    public void worstScoreTestOnce() {
        //    Given: I am a user
        String name = "Irfa";

        IPlayerData mockPlayerData = mock(IPlayerData.class);


//    When: I display the worst score
        when(mockPlayerData.getPlayerGamesPlayed(name)).thenReturn(12);
        when(mockPlayerData.getPlayerAverageScore(name)).thenReturn(4.5);
        when(mockPlayerData.getPlayerWorstScore(name)).thenReturn(7);
        when(mockPlayerData.getPlayerBestScore(name)).thenReturn(1);
        IDisplayFlow flow = new DisplayFlow(mockPlayerData);
        flow.leaderBoard(name);

//    Then: worst score method is called once

        verify(mockPlayerData, times(1)).getPlayerWorstScore(name);
//

    }

    @Test
    public void avgScoreTestOnce() {
        //    Given: I am a user
        String name = "Irfa";

        IPlayerData mockPlayerData = mock(IPlayerData.class);


//    When: I display the worst score
        when(mockPlayerData.getPlayerGamesPlayed(name)).thenReturn(12);
        when(mockPlayerData.getPlayerAverageScore(name)).thenReturn(4.5);
        when(mockPlayerData.getPlayerWorstScore(name)).thenReturn(7);
        when(mockPlayerData.getPlayerBestScore(name)).thenReturn(1);
        IDisplayFlow flow = new DisplayFlow(mockPlayerData);
        flow.leaderBoard(name);

//    Then: average score method is called once

        verify(mockPlayerData, times(1)).getPlayerAverageScore(name);
    }

    @Test
    public void numGamesTestOnce() {
        //    Given: I am a user
        String name = "Irfa";

        IPlayerData mockPlayerData = mock(IPlayerData.class);


//    When: I display the worst score
        when(mockPlayerData.getPlayerGamesPlayed(name)).thenReturn(12);
        when(mockPlayerData.getPlayerAverageScore(name)).thenReturn(4.5);
        when(mockPlayerData.getPlayerWorstScore(name)).thenReturn(7);
        when(mockPlayerData.getPlayerBestScore(name)).thenReturn(1);
        IDisplayFlow flow = new DisplayFlow(mockPlayerData);
        flow.leaderBoard(name);

//    Then: average score method is called once

        verify(mockPlayerData, times(1)).getPlayerGamesPlayed(name);
    }

}
