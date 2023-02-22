package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Round;
import com.rockpaperscissor.app.View.PlayersView;
import com.rockpaperscissor.app.View.RPSGameView;

public class RPSGameController {
    private Player playerA;
    private Player playerB;
    private RoundController roundController;


    public void setup(){
        playerA = PlayerController.registerPlayer();
        playerB = PlayerController.registerPlayer();
        roundController = new RoundController(playerA,playerB);
    }
    
    public void execute(){
        RPSGameView.play(playerA.getName(), playerB.getName());
        roundController.executeRounds();
    }

    public void determineWinner(){
        //TODO
    }
}
