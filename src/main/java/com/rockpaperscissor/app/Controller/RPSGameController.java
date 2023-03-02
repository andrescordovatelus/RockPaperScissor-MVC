package com.rockpaperscissor.app.controller;

import com.rockpaperscissor.app.controller.player.PlayerAdminController;
import com.rockpaperscissor.app.controller.player.PlayerController;
import com.rockpaperscissor.app.model.RPSGame;
import com.rockpaperscissor.app.view.RPSGameView;

public class RPSGameController {
    private RPSGame game;
    private RPSGameView gameView;
    private PlayerAdminController playerAdminController;
    private PlayerController[] playersController;
    private RoundController roundController;
    private StatisticController statisticController;
    
    public RPSGameController(RPSGame game) {
        this.game = game;
        this.gameView = new RPSGameView();
        playerAdminController = new PlayerAdminController();
        playersController = new PlayerController[2];
        roundController = new RoundController();
        statisticController = new StatisticController();
    }

    public void setup(){
        gameView.showMainWindow();
        playerAdminController.initGame();
        playersController = playerAdminController.setPlayersControllers();
        game.newGame(playersController[0].getPlayer(),playersController[1].getPlayer());
        roundController.setRound(game.getRound());
        roundController.setPlayersController(playersController);
        //roundController.setStatisticController(statisticController);
    }

    public void initGame(){
        roundController.initGame();
    }

    public void statistics(){
        statisticController.showStatistics();
    }

}
