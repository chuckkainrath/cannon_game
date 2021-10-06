package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PostGameFlowTest {

    @Test
    public void searchForPlayerCalledOnce() {
        // Given I have a name of 'chuck' and finished a game with a score of 5
        // and 'chuck' is in the database
        String name = "chuck";
        int score = 5;

        // When I invoke the postGameFlow
        IDatabase mockDb = mock(IDatabase.class);
        IPlayer mockPlayer = mock(IPlayer.class);
        IDisplayStats mockDisplay = mock(IDisplayStats.class);
        when(mockDb.searchForPlayer(name)).thenReturn(mockPlayer);
        when(mockPlayer.updateScore(score)).thenReturn(null);
        when(mockDisplay.displayStats(mockPlayer)).thenReturn(null);
        when(mockDb.savePlayer(mockPlayer)).thenReturn(null);


        IPostGameFlow postGameFlow = new PostGameFlow(mockDb, mockDisplay);
        postGameFlow.postGame(name, score);

        // Then I call searchForPlayer once
        verify(mockDb, times(1)).searchForPlayer(name);
    }

    @Test
    public void updateScoreCalledOnce() {
        // Given I have a name of 'chuck' and finished a game with a score of 5
        // and 'chuck' is in the database
        String name = "chuck";
        int score = 5;

        // When I invoke the postGameFlow
        IDatabase mockDb = mock(IDatabase.class);
        IPlayer mockPlayer = mock(IPlayer.class);
        IDisplayStats mockDisplay = mock(IDisplayStats.class);
        when(mockDb.searchForPlayer(name)).thenReturn(mockPlayer);
        when(mockPlayer.updateScore(score)).thenReturn(null);
        when(mockDisplay.displayStats(mockPlayer)).thenReturn(null);
        when(mockDb.savePlayer(mockPlayer)).thenReturn(null);


        IPostGameFlow postGameFlow = new PostGameFlow(mockDb, mockDisplay);
        postGameFlow.postGame(name, score);


        // Then I call updatePlayer once
        verify(mockPlayer, times(1)).updatePlayer(score);
    }

    @Test
    public void displayScoreCalledOnce() {
        // Given I have a name of 'chuck' and finished a game with a score of 5
        // and 'chuck' is in the database
        String name = "chuck";
        int score = 5;

        // When I invoke the postGameFlow
        IDatabase mockDb = mock(IDatabase.class);
        IPlayer mockPlayer = mock(IPlayer.class);
        IDisplayStats mockDisplay = mock(IDisplayStats.class);
        when(mockDb.searchForPlayer(name)).thenReturn(mockPlayer);
        when(mockPlayer.updateScore(score)).thenReturn(null);
        when(mockDisplay.displayStats(mockPlayer)).thenReturn(null);
        when(mockDb.savePlayer(mockPlayer)).thenReturn(null);


        IPostGameFlow postGameFlow = new PostGameFlow(mockDb, mockDisplay);
        postGameFlow.postGame(name, score);

        // Then I call displayStats once
        verify(mockDisplay, times(1)).displayStats(player);
    }

    @Test
    public void savePlayerCalledOnce() {
        // Given I have a name of 'chuck' and finished a game with a score of 5
        // and 'chuck' is in the database
        String name = "chuck";
        int score = 5;

        // When I invoke the postGameFlow
        IDatabase mockDb = mock(IDatabase.class);
        IPlayer mockPlayer = mock(IPlayer.class);
        IDisplayStats mockDisplay = mock(IDisplayStats.class);
        when(mockDb.searchForPlayer(name)).thenReturn(mockPlayer);
        when(mockPlayer.updateScore(score)).thenReturn(null);
        when(mockDisplay.displayStats(mockPlayer)).thenReturn(null);
        when(mockDb.savePlayer(mockPlayer)).thenReturn(null);

        IPostGameFlow postGameFlow = new PostGameFlow(mockDb, mockDisplay);
        postGameFlow.postGame(name, score);

        // Then I call displayStats once
        verify(mockDb, times(1)).savePlayer(player);
    }
}
