package com.saggezza.cannon_game;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.mockito.Mockito.*;

public class MainGameFlowTest {


    @Test
    public void startGameFlowTest() {

        // Given : The user exists in the database
        IStartGameFlow mockStartGameObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("n".getBytes()));
        when(mockStartGameObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : The startgameflow object is called once
        verify(mockStartGameObj, times(1)).StartGame();

    }

    @Test
    public void gameFlowTestWithUser() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("n".getBytes()));
        when(mockStartGameFlowUserObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : the gameflow object is called once
        verify(mockGameFlowObj, times(1)).playGame();
    }


    @Test
    public void postGameFlowTest() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("n".getBytes()));
        when(mockStartGameFlowUserObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow gameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        gameFlow.startGame();

        // Then: the postgameflow object is called once // End MainGameFlow
        verify(mockPostFlowObj, times(1)).postGame("mansour", 3);

    }

    @Test
    public void startGameFlowTest2() {

        // Given : The user exists in the database
        IStartGameFlow mockStartGameObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("y\nn".getBytes()));
        when(mockStartGameObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : The startgameflow object is called once
        verify(mockStartGameObj, times(1)).StartGame();

    }

    @Test
    public void gameFlowTestWithUser2() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("y\nn".getBytes()));
        when(mockStartGameFlowUserObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow mainGameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        mainGameFlow.startGame();

        // Then : the gameflow object is called once
        verify(mockGameFlowObj, times(2)).playGame();
    }


    @Test
    public void postGameFlowTest2() {

        // Given: The user exists
        IStartGameFlow mockStartGameFlowUserObj = mock(StartGameFlow.class);
        IGameFlow mockGameFlowObj = mock(GameFlow.class);
        IPostGameFlow mockPostFlowObj = mock(PostGameFlow.class);

        System.setIn(new ByteArrayInputStream("y\nn".getBytes()));
        when(mockStartGameFlowUserObj.StartGame()).thenReturn("mansour");
        when(mockGameFlowObj.playGame()).thenReturn(3).thenReturn(3);

        // When: The user starts the game
        IMainGameFlow gameFlow = new MainGameFlow(mockStartGameFlowUserObj, mockGameFlowObj, mockPostFlowObj);
        gameFlow.startGame();

        // Then: the postgameflow object is called once // End MainGameFlow
        verify(mockPostFlowObj, times(2)).postGame("mansour", 3);

    }

}

