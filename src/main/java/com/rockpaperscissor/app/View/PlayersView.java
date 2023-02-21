package com.rockpaperscissor.app.View;

import java.util.Scanner;

import com.rockpaperscissor.app.utils.Console;

public  class PlayersView {

    public static int selectPlayerType(){
        System.out.println("SELECT PLAYER TYPE");
        System.out.println("1.HUMAN \n 2.COMPUTER");
        System.out.print("\tYour option: ");
        return Console.getInt();
    }

    public static String setPlayerInfo(){
        System.out.print("Name: ");
        return Console.getStringNext();
    }

    public static int selectShape(){
        System.out.println("> Select shape...");
        System.out.println("Choose your option \n 1.Rock" +
        "\n 2.Paper \n 3.Scissors");
        int option = Console.getInt();
        return option;
    }

}
