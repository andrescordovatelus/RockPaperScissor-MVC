package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.RPSGame;
import com.rockpaperscissor.app.View.RPSGameView;

public class RPSGameController {
    private RPSGame game;
    private RPSGameView gameView;
    private PlayerController playerController;
    private RoundController roundController;
    
    public RPSGameController(RPSGame game) {
        this.game = game;
        this.gameView = new RPSGameView();
        playerController = new HumanController();
        roundController = new RoundController();
    }

    public void setup(){
        gameView.showMainWindow();
        playerController.setNewGamePlayers();
        game.newGame(playerController.getPlayerA(), playerController.getPlayerB());
        roundController.setRound(game.getRound());
        roundController.setPlayersControllers(playerController);
    }

    public void initGame(){
        roundController.initGame();
    }
}
