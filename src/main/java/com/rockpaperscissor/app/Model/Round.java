package com.rockpaperscissor.app.model;

public class Round {
    private Player playerA;
    private Player playerB;
    private final int totalRounds = 3;

    public int getTotalRounds() {
        return totalRounds;
    }

    public void setPlayers(Player playerA,Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

}
