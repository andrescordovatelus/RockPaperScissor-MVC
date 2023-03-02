package com.rockpaperscissor.app.view.player;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Shape;
import com.rockpaperscissor.app.utils.Console;
import com.rockpaperscissor.app.utils.PlayerType;

public abstract class PlayerView {
    
    public abstract String getName();

    public abstract Shape selectShape();

}
