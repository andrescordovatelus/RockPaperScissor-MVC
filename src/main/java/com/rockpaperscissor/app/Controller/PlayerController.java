package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.PlayersView;

public abstract class PlayerController {
    private Player playerA;
    private Player playerB;
    protected PlayersView playerView;

    public PlayerController() {
        playerView = new PlayersView();
    }

    public void setNewGamePlayers(){
        boolean distinct = false;

        do {
            playerA = playerView.setPlayerInfo();
            playerB = playerView.setPlayerInfo();
            if(playerA.getName() == playerB.getName()){
                distinct = false;
            }else{
                distinct = true;
            }
        } while (distinct == false);
    }

    public Player getPlayerA() {
        return playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public abstract Shape selectShape();

}
