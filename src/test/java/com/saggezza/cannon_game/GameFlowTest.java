package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameFlowTest {

    @Test
     public void shootOnceTest(){

        //Given I have the game started

        IShotFlow mockShotFlow = mock(IShotFlow.class);
        ITarget targetMock = mock(ITarget.class);
        when(targetMock.getxTarget()).thenReturn(5);
        when(targetMock.getyTarget()).thenReturn(7);
        when(mockShotFlow.shoot(5,7)).thenReturn(true);

        //when the GameFlow class is executed
        IGameFlow gameFlow = new GameFlow(mockShotFlow, targetMock);
        gameFlow.playGame();

        //Then I call the ShotFlow class once

        verify(mockShotFlow, times(1)).shoot(5,7);

    }

    @Test
    public void shootTwiceTest(){

        //Given I have the game started

        IShotFlow mockShotFlow = mock(IShotFlow.class);
        ITarget targetMock = mock(ITarget.class);
        when(targetMock.getxTarget()).thenReturn(5);
        when(targetMock.getyTarget()).thenReturn(7);
        when(mockShotFlow.shoot(5,7)).thenReturn(false).thenReturn(true);

        //when the GameFlow class is executed
        IGameFlow gameFlow = new GameFlow(mockShotFlow, targetMock);
        gameFlow.playGame();

        //Then I call the ShotFlow class twice

        verify(mockShotFlow, times(2)).shoot(5,7);

    }






}
