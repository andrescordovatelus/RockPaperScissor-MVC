package com.rockpaperscissor.app.Controller;


import com.rockpaperscissor.app.Model.Player;
import com.rockpaperscissor.app.Model.Round;
import com.rockpaperscissor.app.Model.Shape;
import com.rockpaperscissor.app.View.RoundView;

public class RoundController{
    private RoundView roundView;
    private Round round;
    private static int roundCounter = 1;
    private PlayerController playerController;
    private PlayerController playerAController;
    private PlayerController playerBController;

    public RoundController(){
        roundView = new RoundView();
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public void setPlayersControllers(PlayerController playerController) {
        this.playerController = playerController;
        if(playerController.getPlayerA().getIsHuman() == true){
            playerAController = new HumanController();
        }else{
            playerAController = new ComputerController();
        }

        if(playerController.getPlayerB().getIsHuman() == true){
            playerBController = new HumanController();
        }else{
            playerBController = new ComputerController();
        }
    }

    public void determinateWinner(Player playerA, Player playerB){
        if(playerA.getScore() > playerB.getScore()){
            System.out.println("\tWINNER: " + playerA.getName() + "\tSCORE: " + playerA.getScore());
            System.out.println("\tLOSER: " + playerB.getName() + "\tSCORE: " + playerB.getScore());
        }else{
            System.out.println("\tWINNER: " + playerB.getName() + "\tSCORE: " + playerB.getScore());
            System.out.println("\tLOSER: " + playerA.getName() + "\tSCORE: " + playerA.getScore());

        }
    }

    public void initGame() {
        Player playerA = playerController.getPlayerA();
        Player playerB = playerController.getPlayerB();
        Shape shapePlayerA;
        Shape shapePlayerB;
        do{
            roundView.executeRound(roundCounter, playerA.getName());
            shapePlayerA = playerAController.selectShape();
            shapePlayerB = playerBController.selectShape();
            System.out.println(shapePlayerB);
            if(shapePlayerA.equals(shapePlayerB)){
                roundView.showTie();
            }else{
                roundCounter++;
                if(Shape.winsWith(shapePlayerA,shapePlayerB)){
                    playerA.setScore();
                }else{
                    playerB.setScore();
                }
            }
        }while(roundCounter <= round.getTotalRounds());
        determinateWinner(playerA, playerB);
    }

}
