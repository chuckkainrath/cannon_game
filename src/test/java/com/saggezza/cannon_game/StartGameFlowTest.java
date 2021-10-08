package com.saggezza.cannon_game;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class StartGameFlowTest {

@Test
    public void flowTest1(){

    //Given: chuck is in the records

    //When: I enter the name 'chuck'

    String input = "chuck";
    System.setIn(new ByteArrayInputStream(input.getBytes()));
     IPlayerData mPlayerData = mock(PlayerData.class);
     when(mPlayerData.playerExists("chuck")).thenReturn(true);

    IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

     IStartGameFlow flowTest1 = new StartGameFlow(mPlayerData,mDisplayFlow);
    String name = flowTest1.StartGame();

    //Then: the playerExists method is called once

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
        String name = flowTest2.StartGame();

        verify(mPlayerData,times(1)).playerExists("shilpa");

    }
    @Test
    public void flowTest3(){
        //Given : chuck exists

        //when: i start the game

        String input = "chuck";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        IPlayerData mPlayerData = mock(PlayerData.class);
        when(mPlayerData.playerExists("chuck")).thenReturn(true);

        IDisplayFlow mDisplayFlow = mock(DisplayFlow.class);

        IStartGameFlow flowTest2 = new StartGameFlow(mPlayerData,mDisplayFlow);
        String name = flowTest2.StartGame();

//then: the object to display stats is called once

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
        String name = flowTest2.StartGame();

        verify(mDisplayFlow, times(0)).leaderBoard("shilpa");
    }
}

