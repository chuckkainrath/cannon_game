package com.saggezza.cannon_game;

import java.util.Scanner;

public class MainGameFlow implements IMainGameFlow {

    private final IStartGameFlow startGameFlow;
    private final IGameFlow gameFlow;
    private IPostGameFlow postGameFlow;

    public MainGameFlow(IStartGameFlow startGameFlow, IGameFlow gameFlow, IPostGameFlow postGameFlow) {
        this.startGameFlow = startGameFlow;
        this.gameFlow = gameFlow;
        this.postGameFlow = postGameFlow;
    }

    public void startGame() {

        startGameFlow.start();
        gameFlow.playGame();
        postGameFlow.postGame();

        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to play again? Enter Y/N:");
        String str = reader.nextLine();

        while (str.toLowerCase() == "y") {
            gameFlow.playGame();
            postGameFlow.startPostGame();
        }
        System.out.println(("Thanks for playing!"));
    }

}
