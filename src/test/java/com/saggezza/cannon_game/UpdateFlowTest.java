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
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: each of the getBestScore method is called once.
        verify(playerData, times(1)).getPlayerBestScore(name);
    }

    @Test
    public void getWorstCalledOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: each of the getWorstScore method is called once.
        verify(playerData, times(1)).getPlayerWorstScore(name);
    }

    @Test
    public void getAverageCalledOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: each of the getPlayerAverageScore method is called once.
        verify(playerData, times(1)).getPlayerAverageScore(name);
    }

    @Test
    public void getGamesPlayedOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);



        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);


        //Then: each of the getPlayerGamesPlayed method is called once.
        verify(playerData, times(1)).getPlayerGamesPlayed(name);
    }

    @Test
    public void updateBestScoreOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

       IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
       when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: computeBestScore method is called once.
        verify(updateBest, times(1)).computeBestScore(4,5);
}

    @Test
    public void updateWorstScoreOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: computeWorstScore method is called once.
        verify(updateWorst, times(1)).computeWorstScore(8,5);


}

    @Test
    public void updateAverageScoreOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: updateAverage method is called once.
        verify(updateAverage, times(1)).computeAverageScore(6.2,12,5);


    }

    @Test
    public void writeUpdateOnce() {
        //Given: Mansoor exists and I score 5.
        String name = "Mansoor";
        int score = 5;
        IPlayerData playerData = mock(IPlayerData.class);
        when(playerData.getPlayerBestScore(name)).thenReturn(4);
        when(playerData.getPlayerWorstScore(name)).thenReturn(8);
        when(playerData.getPlayerAverageScore(name)).thenReturn(6.2);
        when(playerData.getPlayerGamesPlayed(name)).thenReturn(12);

        IUpdateBestScore updateBest = mock(IUpdateBestScore.class);
        when(updateBest.computeBestScore(4,5)).thenReturn(4);

        IUpdateWorstScore updateWorst = mock(IUpdateWorstScore.class);
        when(updateWorst.computeWorstScore(8,5)).thenReturn(8);

        IUpdateAverageScore updateAverage = mock(IUpdateAverageScore.class);
        when(updateAverage.computeAverageScore(6.2,12, 5)).thenReturn(6.11);

        //When: I update Mansoor's stats.
        IUpdateFlow updateFlow = new UpdateFlow(playerData, updateBest, updateWorst, updateAverage);
        updateFlow.updatePlayer(name, score);

        //Then: updatePlayer method is called once.
        verify(playerData, times(1)).updatePlayer(name, 4, 8, 13, 6.11);


    }
}
