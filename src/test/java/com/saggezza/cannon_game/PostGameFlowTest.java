package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PostGameFlowTest {

    @Test
 public void CreatePlayerTest(){
       // Given : Chuck does not exists
        IPlayerData mockCreatePlayer = mock(IPlayerData.class);
        when(mockCreatePlayer.playerExists("Chuck")).thenReturn(false);

       // When: The game has ended

      // Then: create player method is called once


    }
}
