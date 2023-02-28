package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.PlayersView;

public class HumanController extends PlayerController {
    private PlayersView playerView;


    @Override
    public Shape selectShape() {
        playerView = new PlayersView();
        playerView.selectShape();
        
        switch (shapeNumber) {
            case 1:
                return Shape.ROCK;
        
            case 2:
                return Shape.PAPER;

            case 3:
                return Shape.SCISSOR;

            default:

                break;
        }

        return Shape.PAPER;
    }
}
