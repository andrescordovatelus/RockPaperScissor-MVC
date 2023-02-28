package com.rockpaperscissor.app.Controller;

import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.PlayersView;

public class RoundController{
    private Player playerA;
    private Player playerB;
    private int roundCounter;
    private Shape shape;
    private PlayerController playerAController;
    
    public RoundController() {
    }

    public RoundController(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;

    }

    public void executeRounds(){
        //playerAController = new HumanController();
        System.out.println("> Ejecutando los rounds..");
        //playerA = Pla

    }

    public void determinateRoundWinner(){
        System.out.println("> Determinando el ganador por ronda..");
    }

    public void determinateWinner(){
        System.out.println("> Determinando el ganador del juego..");
    }


    
}
