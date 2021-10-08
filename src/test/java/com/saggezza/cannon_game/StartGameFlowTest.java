package com.saggezza.cannon_game;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class StartGameFlowTest {

@Test
    public void flowTest1(){

    String input = "chuck";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
     IPlayerData mPlayerData = mock(PlayerData.class);
     when(mPlayerData.playerExists("chuck")).thenReturn(true);

    IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

     IStartGameFlow flowTest1 = new StartGameFlow(mPlayerData,mDisplayFlow);
    flowTest1.StartGame();

     verify(mPlayerData,times(1)).playerExists("chuck");
    }

    @Test
    public void flowTest2(){
        String input = "shilpa";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("shilpa")).thenReturn(false);

        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame();

        verify(mPlayerData,times(1)).playerExists("shilpa");

    }
    @Test
    public void flowTest3(){
        String input = "chuck";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("chuck")).thenReturn(true);

        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame();

       verify(mDisplayFlow, times(1)).leaderBoard("chuck");
    }

    @Test
    public void flowTest4(){
        String input = "shilpa";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("shilpa")).thenReturn(false);
        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        flowTest2.StartGame();

        verify(mDisplayFlow, times(0)).leaderBoard("shilpa");
    }
}

