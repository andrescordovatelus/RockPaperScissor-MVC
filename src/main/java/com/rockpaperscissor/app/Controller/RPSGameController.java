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
        game.newGame();
        roundController.setRound(game.getRound());
        roundController.setPlayers(playerAdminController.getGamePlayers[0],playerAdminController.getGamePlayers[1]);
        playersController = playerAdminController.setPlayersControllers();
        roundController.setPlayersController(playersController);
        roundController.setStatisticFacade(new StatisticFacade(statisticController));
    }

    public void initGame(){
        roundController.initGame();
    }

    public void statistics(){
        statisticController.showStatistics();
    }

}
