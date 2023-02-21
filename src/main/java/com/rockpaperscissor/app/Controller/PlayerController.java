package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.PlayersView;

public abstract class PlayerController {
    public abstract Shape selectShape(int shapeNumber);

    public static Player registerPlayer(){
        Player player = null;
        int playerType = PlayersView.selectPlayerType();
        String playerName = PlayersView.setPlayerInfo();

        switch (playerType) {
            case 1:
                player = new Player(playerName, true);
                break;
            case 2:
                player = new Player(playerName, false);
                break;
            default:
                System.out.println("INVALID PLAYER TYPE");
                break;
        }
        return player;
    }
}
