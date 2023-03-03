package com.rockpaperscissor.app;

import com.rockpaperscissor.app.controller.RPSGameController;
import com.rockpaperscissor.app.model.RPSGame;

public class RPSApp {
    private RPSGame game;
    private RPSGameController gameController;
    
    public RPSApp() {
        game = new RPSGame();
        gameController = new RPSGameController(game);
    }

    public void executeGame(){
        gameController.setup();
        gameController.initGame();
        gameController.statistics();
    }
}
