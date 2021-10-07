package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class PostGameFlowTest {

    @Test
 public void PlayerExistTest(){


       // Given : Chuck does not exists
        String Chuck="Chuck";
        int score=5;

        IPlayerData mockPlayerdata= mock(IPlayerData.class);
        IUpdateFlow mockupdateFlow=mock(IUpdateFlow.class);

        // When: The game has ended and we confirm the user doesn't exist
        when(mockPlayerdata.playerExists("Chuck")).thenReturn(false);
        IPostGameFlow flow=new PostGameFlow(mockPlayerdata,mockupdateFlow);
        flow.postGame("Chuck",5);
        // Then:  playerExists  method is called once

            verify(mockPlayerdata, times(1)).playerExists("Chuck");
    }
@Test

        public void CreatePlayerTest() {


            // Given : Chuck does not exists
            String Chuck = "Chuck";
            int score = 5;

            IPlayerData mockPlayerdata = mock(IPlayerData.class);
            IUpdateFlow mockupdateFlow=mock(IUpdateFlow.class);
            // When: The game has ended and we confirm the user doesn't exist
            when(mockPlayerdata.playerExists("Chuck")).thenReturn(false);
           // when(mockPlayerdata.createPlayer("Chuck",5,5,1,5)).thenReturn()
            IPostGameFlow flow = new PostGameFlow(mockPlayerdata,mockupdateFlow);
            flow.postGame("Chuck", 5);
            // Then:  playerExists  method is called once

            verify(mockPlayerdata, times(1)).createPlayer("Chuck",5,5,1,5);
        }
@Test

    public void UpdateFlowTest() {


        // Given : Chuck  exists
        String Chuck = "Chuck";
        int score = 5;

        IPlayerData mockPlayerdata = mock(IPlayerData.class);
        IUpdateFlow mockUpdate =mock(IUpdateFlow.class);
        // When: The game has ended and we confirm the user  exist
        when(mockPlayerdata.playerExists("Chuck")).thenReturn(true);


        IPostGameFlow flow = new PostGameFlow(mockPlayerdata,mockUpdate);
        flow.postGame("Chuck", 5);
        //   Then: updateflow is called once
      //  verify(mockPlayerdata, times(1)).createPlayer("Chuck",5,5,1,5);
        verify(mockUpdate,times(1)).updatePlayer("Chuck",5);
    }
@Test
    public void DisplayTest(){

}

}


    }

