package com.rockpaperscissor.app.controller;

import com.rockpaperscissor.app.controller.player.PlayerController;
import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Round;
import com.rockpaperscissor.app.model.Shape;
import com.rockpaperscissor.app.utils.PlayerType;
import com.rockpaperscissor.app.view.RoundView;

public class RoundController{
    private RoundView roundView;
    private Round round;
    private static int roundCounter = 1;
    private PlayerController[] playersController;
    //private StatisticController statisticController;

    public RoundController(){
        roundView = new RoundView();
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public void setPlayersController(PlayerController[] playersController) {
        this.playersController = playersController;
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
        PlayerController playerController;
        Shape shapePlayer;
        do{
            playerController = this.getPlayerController();
            roundView.executeRound(roundCounter, playerController.getName());
            shapePlayer = playerController.selectShape();
            /*if(shapePlayerA.equals(shapePlayerB)){
                roundView.showTie();
            }else{
                if(Shape.winsWith(shapePlayerA,shapePlayerB)){
                    playerA.setScore();
                }else{
                    playerB.setScore();
                }
                statisticController.addStatistic(new StatisticItem(roundCounter, playerA.getName(), 
                shapePlayerA, playerB.getName(), shapePlayerB));*/
                roundCounter++;

            //}
        }while(roundCounter <= round.getTotalRounds());
        //determinateWinner(playerA, playerB);
    }

    /*public void setStatisticController(StatisticController statisticController){
        this.statisticController = statisticController;
    }*/

    public PlayerController getPlayerController(){
        if(playersController[0].getPlayerType() == PlayerType.HUMAN){
            return playersController[0];
        }else{
            return playersController[1];
        }
    }
}