package com.rockpaperscissor.app.controller.player;

import java.util.Random;

import com.rockpaperscissor.app.model.Shape;
import com.rockpaperscissor.app.utils.PlayerType;
import com.rockpaperscissor.app.view.player.ComputerPlayerView;
import com.rockpaperscissor.app.view.player.PlayerView;

public class ComputerController extends PlayerController  {

    @Override
    public Shape selectShape() {
        Random rn = new Random();
        return Shape.values()[rn.nextInt(2)+1];
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
