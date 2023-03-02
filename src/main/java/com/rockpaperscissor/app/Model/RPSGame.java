package com.rockpaperscissor.app.model;

public class RPSGame {
    private Round round;

    public void newGame(){
        this.round = new Round();
    }

    public Round getRound() {
        return round;
    }
    
}
