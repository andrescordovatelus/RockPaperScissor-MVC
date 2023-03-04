package com.rockpaperscissor.app.view;

import com.rockpaperscissor.app.model.Player;

public class RoundView {
    public void executeRound(int round, String name) {
        System.out.println("ROUND " + round + " IS STARTING");
        System.out.println(name + "'s turn");
    }

    public void showWinner(Player winner, Player loser) {
        System.out.println(winner.getName()
                + " with " + winner.getScore() + " pts "
                + " WON AGAINST "
                + loser.getName() + " with " + loser.getScore() + " pts");
    }

    public void showTie() {
        System.out.println("TIE! Please try to play again");
    }

}
