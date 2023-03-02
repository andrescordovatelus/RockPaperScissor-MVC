package com.rockpaperscissor.app.controller.player;

import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerControllerFactory {
    
    public static PlayerController getPlayerController(PlayerType playerType){
        assert(playerType != null);
        switch(playerType){
            case HUMAN:
                return new HumanController();
            case COMPUTER:
                return new ComputerController();
            default:
                return null;
        }
    }
}
