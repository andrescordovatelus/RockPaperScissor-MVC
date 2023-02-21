package com.rockpaperscissor.app;

import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.RPSGameView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RPSGameView game = new RPSGameView();
        game.createPlayer();
        game.play();
    }
}
