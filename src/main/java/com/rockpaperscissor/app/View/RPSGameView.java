package com.rockpaperscissor.app.View;

import java.util.Scanner;

public class RPSGameView {

    public void createPlayer(){

    }

    public static int chooseGameMode(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose your gamemode");
        System.out.println("1. HUMAN VS HUMAN");
        System.out.println("2. HUMAN VS COMPUTER");
        System.out.println("3. COMPUTER VS COMPUTER");
        int option = in.nextInt();
        return option;
    }


    
}
