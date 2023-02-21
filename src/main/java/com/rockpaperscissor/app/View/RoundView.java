package com.rockpaperscissor.app.View;

import com.rockpaperscissor.app.Model.Player;

public class RoundView {

    public void executeRound(int round){
        System.out.println("ROUND " + round + " IS STARTING");
    }

    public void showRoundWinner(Player winner){
        System.out.println(winner.getName() + " WON THE ROUND " 
        + " HAS A SCORE OF " + winner.getScore());

    }



}
