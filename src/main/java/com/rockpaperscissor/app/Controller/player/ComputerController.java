package com.rockpaperscissor.app.controller.player;


import com.rockpaperscissor.app.utils.PlayerType;
import com.rockpaperscissor.app.utils.Shape;
import com.rockpaperscissor.app.view.player.ComputerPlayerView;
import com.rockpaperscissor.app.view.player.PlayerView;

public class ComputerController extends PlayerController  {

    @Override
    public Shape selectShape() {
        return playerView.selectShape();
    }

    @Override
    public PlayerView initPlayerView() {
        return new ComputerPlayerView();
    }

    @Override
    public PlayerType initPlayerType() {
        return PlayerType.COMPUTER;
    }
    
}
