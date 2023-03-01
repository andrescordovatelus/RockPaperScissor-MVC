package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Shape;

public class HumanController extends PlayerController {

    @Override
    public Shape selectShape() {
        return playerView.selectShape();
    }
}
