package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.PlayersView;
import com.rockpaperscissor.app.utils.Console;

public class HumanController extends PlayerController {

    @Override
    public Shape selectShape() {
        PlayersView.selectShape();
        int shapeNumber = Console.getInt();
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
