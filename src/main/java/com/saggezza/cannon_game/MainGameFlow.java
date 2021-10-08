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

        String name = startGameFlow.StartGame();
        int score = gameFlow.playGame();
        postGameFlow.postGame(name, score);

        Scanner reader = new Scanner(System.in);
        System.out.println("Would you like to play again? Enter Y/N:");
        String str = reader.nextLine();

        while (str.toLowerCase().equals("y")) {
            score = gameFlow.playGame();
            postGameFlow.postGame(name, score);
            System.out.println("Would you like to play again? Enter Y/N:");
            str = reader.nextLine();
        }
        System.out.println(("Thanks for playing!"));
    }

}
