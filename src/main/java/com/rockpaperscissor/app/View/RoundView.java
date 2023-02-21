package com.rockpaperscissor.app.View;

import com.rockpaperscissor.app.Controller.RoundController;

public class RoundView {

    PlayersView playersView = new PlayersView();
    RoundController roundController = new RoundController();
    
    public void playRound(){
        //TODO Logic here...
        playersView.selectShape();
        roundController.executeRounds();
        roundController.determinateRoundWinner();
        roundController.determinateWinner();
    }
}
