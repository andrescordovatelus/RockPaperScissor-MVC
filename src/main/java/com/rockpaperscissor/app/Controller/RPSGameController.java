package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Round;
import com.rockpaperscissor.app.View.PlayersView;
import com.rockpaperscissor.app.View.RPSGameView;

public class RPSGameController {
    private Player playerA;
    private Player playerB;
    private Round round;
    //private RoundController rounds;


    public void setup(){
        playerA = PlayerController.registerPlayer();
        playerB = PlayerController.registerPlayer();
    }
    
    public void execute(){
        RPSGameView.play(playerA.getName(), playerB.getName());
    }

    public void determineWinner(){
        //TODO
    }
}
