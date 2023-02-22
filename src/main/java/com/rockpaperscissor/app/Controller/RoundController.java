package com.rockpaperscissor.app.Controller;


import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Round;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.RoundView;

public class RoundController{
    private Player playerA;
    private Player playerB;
    private static int roundCounter = 1;
    private Shape shapePlayerA;
    private Shape shapePlayerB;
    private Round round;
    private PlayerController playerAController;
    private PlayerController playerBController;

    public RoundController(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        round = new Round();
    }

    public void executeRounds(){
        do {
            RoundView.executeRound(roundCounter);
            if(playerA.getIsHuman()){
                playerAController = new HumanController();
            }else{
                playerAController = new ComputerController();
            }

            if(playerB.getIsHuman()){
                playerBController = new HumanController();
            }else{
                playerBController = new ComputerController();
            }
            shapePlayerA = playerAController.selectShape();
            shapePlayerB = playerBController.selectShape();
            if(shapePlayerA != shapePlayerB){
                roundCounter++;
            }else{
                System.out.println("TIE! PLAY AGAIN");
            }
        } while (roundCounter <= round.getTotalRounds());
    }

    public void determinateRoundWinner(){
        System.out.println("> Determinando el ganador por ronda..");
    }

}
