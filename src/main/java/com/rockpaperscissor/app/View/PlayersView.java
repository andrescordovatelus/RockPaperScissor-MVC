package com.rockpaperscissor.app.View;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.utils.Console;

public  class PlayersView {

    private int selectPlayerType(){
        System.out.println("SELECT PLAYER TYPE");
        System.out.println("1.HUMAN \n 2.COMPUTER");
        System.out.print("\tYour option: ");
        return Console.getInt();
    }

    public Player setPlayerInfo(){
        boolean isHuman;
        int type;
        System.out.print("Name: ");
        String name = Console.getStringNext();
        type = selectPlayerType();
        switch(type){
            case 1:
                isHuman = true;
                break;
            case 2:
                isHuman = false;
                break;
            default:
                isHuman = true;
                break;
        }
        return new Player(name, isHuman);
    }

    public Shape selectShape(){
        System.out.println("> Select shape...");
        System.out.println("Choose your option \n 1.Rock" +
        "\n 2.Paper \n 3.Scissors");
        System.out.print("\tYour option: ");
        int shapeNumber = Console.getInt();
        switch (shapeNumber) {
            case 1:
                return Shape.ROCK;
        
            case 2:
                return Shape.PAPER;

            case 3:
                return Shape.SCISSOR;

            default:
                return Shape.PAPER;
        }
    }

}
