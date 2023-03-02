package com.rockpaperscissor.app.view.player;

import com.rockpaperscissor.app.model.Shape;
import com.rockpaperscissor.app.utils.Console;

public class HumanPlayerView extends PlayerView {

    @Override
    public String getName() {
        System.out.print("Name: ");
        return Console.getStringNext();
    }

    @Override
    public Shape selectShape() {
        System.out.println("SELECT A SHAPE");
        for(Shape shape : Shape.values()){
            System.out.println((shape.ordinal() + 1) + shape.toString());
        }
        int shape = Console.getInt();
        return Shape.values()[shape - 1];
    }

    
    
}
