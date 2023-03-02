package com.rockpaperscissor.app.controller.player;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Shape;
import com.rockpaperscissor.app.utils.PlayerType;
import com.rockpaperscissor.app.view.player.PlayerView;

public abstract class PlayerController {
    private Player player;
    protected PlayerView playerView;
    protected PlayerType playerType;

    public PlayerController() {
        playerView = initPlayerView();
        playerType = initPlayerType();
    }

    public abstract Shape selectShape();

    public abstract PlayerView initPlayerView();

    public abstract PlayerType initPlayerType();

    public void increaseScore(){
        this.player.setScore();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public String getName() {
        return this.player.getName();
    }

    public PlayerType getPlayerType() {
        return this.player.getType();
    }

}
