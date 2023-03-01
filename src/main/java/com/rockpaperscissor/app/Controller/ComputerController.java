package com.rockpaperscissor.app.Controller;

import java.util.Random;

import com.rockpaperscissor.app.Model.Shape;

public class ComputerController extends PlayerController  {

    @Override
    public Shape selectShape() {
        Random rn = new Random();
        return Shape.values()[rn.nextInt(2)+1];
    }
    
}
