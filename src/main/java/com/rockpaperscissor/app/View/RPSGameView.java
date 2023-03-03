package com.rockpaperscissor.app.view;

import com.rockpaperscissor.app.model.Player;

public class RPSGameView {

    public static void play(String playerAName,String playerBName) {
        System.out.println(">the game just begins...");
        System.out.println(playerAName + " VS "+ playerBName);
    }

    public void showWinner(Player winner){
        System.out.println(winner.getName() + " WON WITH A SCORE OF" + 
        winner.getScore());

    }

    public void showMainWindow() {
        System.out.println("=========WELCOME TO THE ROCK, PAPER & SCISSOR GAME!========");
    }

}
