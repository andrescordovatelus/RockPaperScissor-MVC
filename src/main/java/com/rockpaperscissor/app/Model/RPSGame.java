package com.rockpaperscissor.app.Model;

public class RPSGame {
    private Player playerA;
    private Player playerB;
    private Round round;

    public void setPlayers(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void newGame(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;
        this.round = new Round();
    }

    public Round getRound() {
        return round;
    }

    
}
