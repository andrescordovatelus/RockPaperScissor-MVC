package com.rockpaperscissor.app.View;

import java.util.Scanner;

import com.rockpaperscissor.app.Controller.RPSGameController;
import com.rockpaperscissor.app.Model.Player;

public class RPSGameView {

    RoundView roundView = new RoundView();
    RPSGameController gameController = new RPSGameController();
    Player player1, player2;

    public void createPlayer(){
        //TODO Logic here...
        System.out.println("> Creando jugadores...");
        gameController.registerPlayer();
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

    public void play() {
        //TODO Logic here...
        System.out.println("> Iniciado juego...");
        gameController.setup();
        gameController.execute();
        roundView.playRound();
    }
}
