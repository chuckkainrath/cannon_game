package com.saggezza.cannon_game;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class MainGameFlowTest {


    @Test
    public void startGameFlowTest() {

        // Given : The user exists in the database
        IStartGameFlow mockStartGameObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        // when(mockStartGameObj.checkName("mansour")).thenReturns(true);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : The startgameflow object is called once
        verify(mockStartGameObj, times(1)).checkName("mansour");

    }

    @Test
    public void gameFlowTestWithUser() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        // when(mockStartGameFlowUserObj.checkName("mansour")).thenReturns(true);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : the gameflow object is called once
        verify(mockStartGameFlowUserObj, times(1)).playGame();
    }

    @Test
    public void gameFlowTestWithoutUser() {

        // Given: The user does not exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        // when(mockStartGameFlowUserObj.checkName("mansour")).thenReturns(false);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : The gameflow object is called once
        verify(mockStartGameFlowUserObj, times(1)).playGame();

    }

    @Test
    public void postGameFlowTest() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        // when(mockPostFlowObj.postGame("chuck", 5)).thenReturns(true);

        // When: The user starts the game
        IMainGameFlow gameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        gameFlow.startGame();

        // Then: the postgameflow object is called once // End MainGameFlow
        verify(mockPostFlowObj, times(1)).postGame("chuck", 5);

    }

}

}
