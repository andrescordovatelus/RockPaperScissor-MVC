package com.rockpaperscissor.app.view.player;

import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerViewFactory {
    
    public static PlayerView getPlayerView(PlayerType playerType){
        assert(playerType != null);
        switch(playerType){
            case HUMAN:
                return new HumanPlayerView();
            case COMPUTER:
                return new ComputerPlayerView();
            default:
                return null;
        }
    }
}
