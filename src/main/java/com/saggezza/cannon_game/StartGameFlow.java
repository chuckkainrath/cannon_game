package com.saggezza.cannon_game;

import java.util.Scanner;

public class StartGameFlow implements IStartGameFlow {

    private IPlayerData p1;
    private IDisplayFlow d1;

    public StartGameFlow(IPlayerData player, IDisplayFlow display) {
        p1=player;
        d1=display;
    }

    public void StartGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = input.nextLine();
        boolean b = p1.playerExists(name);

        if(b == true) {

           d1.leaderBoard(name);

        }


    }

}