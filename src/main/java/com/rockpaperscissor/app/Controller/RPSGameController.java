package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;

public class RPSGameController {
    private Player playerA;
    private Player playerB;
    private RoundController rounds;


    public void setup(){
        //int gamemode = RPSGameView.chooseGameMode();

        System.out.println("> Escogiendo a los jugadores...");
    }
    
    public void registerPlayer(){
        System.out.println("> Registrando jugadores...");
    }
    
    public void execute(){
        System.out.println("> Ejecutando el juego...");
    }
}
