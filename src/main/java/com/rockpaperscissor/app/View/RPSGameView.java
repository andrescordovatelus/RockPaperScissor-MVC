package com.rockpaperscissor.app.View;

import java.util.Scanner;

import com.rockpaperscissor.app.Controller.RPSGameController;
import com.rockpaperscissor.app.Model.Player;

public class RPSGameView {

    public static int setUpMenu(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your gamemode");
        System.out.println("1. HUMAN VS HUMAN");
        System.out.println("2. HUMAN VS COMPUTER");
        System.out.println("3. COMPUTER VS COMPUTER");
        int option = in.nextInt();
        return option;
    }

    public void play(String playerAName,String playerBName) {
        System.out.println(">the game just begins...");
        System.out.println(playerAName + " VS "+ playerBName);
    }

    public void showWinner(Player winner){
        System.out.println(winner.getName() + " WON WITH A SCORE OF" + 
        winner.getScore());

    }

}
