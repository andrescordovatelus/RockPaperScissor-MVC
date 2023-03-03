package com.rockpaperscissor.app.view;

import com.rockpaperscissor.app.model.Player;

public class RoundView {

    public void executeRound(int round, String name){
        System.out.println("ROUND " + round + " IS STARTING");
        System.out.println( name + "'s turn");
    }

    public void showRoundWinner(Player winner){
        System.out.println(winner.getName() + " WON THE ROUND " 
        + " HAS A SCORE OF " + winner.getScore());

    }

    public void showTie() {
        System.out.println("TIE! Please try to play again");
    }



}
