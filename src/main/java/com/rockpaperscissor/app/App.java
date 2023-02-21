package com.rockpaperscissor.app;

import com.rockpaperscissor.app.Controller.RPSGameController;
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
        RPSGameController game = new RPSGameController();
        game.setup();
        game.execute();

    }
}
