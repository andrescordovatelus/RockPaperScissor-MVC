package com.rockpaperscissor.app.controller;

import com.rockpaperscissor.app.controller.player.PlayerController;
import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Round;
import com.rockpaperscissor.app.model.StatisticItem;
import com.rockpaperscissor.app.utils.Shape;
import com.rockpaperscissor.app.view.RoundView;

public class RoundController{
    private RoundView roundView;
    private Round round;
    private static int roundCounter = 1;
    private PlayerController[] playersController;
    private StatisticController statisticController;

    public RoundController(){
        roundView = new RoundView();
        playersController = new PlayerController[2];
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
        Shape shapePlayerA;
        Shape shapePlayerB;
        Player playerA = round.getPlayerA();
        Player playerB = round.getPlayerB();
        PlayerController playerController;

        do{

            playerController = playersController[0];
            roundView.executeRound(roundCounter, playerA.getName());
            shapePlayerA = playerController.selectShape();


            playerController = playersController[1];
            roundView.executeRound(roundCounter, playerB.getName());
            shapePlayerB = playerController.selectShape();


            if(shapePlayerA.equals(shapePlayerB)){
                roundView.showTie();
            }else{
                if(Shape.winsWith(shapePlayerA,shapePlayerB)){
                    playersController[0].increaseScore();

                }else{
                    playersController[1].increaseScore();
                }
                statisticController.addStatistic(new StatisticItem(roundCounter, playerA.getName(), 
                shapePlayerA, playerB.getName(), shapePlayerB));
                roundCounter++;
            }
        }while(roundCounter <= round.getTotalRounds());
        determinateWinner(playerA, playerB);
    }

    public void setStatisticController(StatisticController statisticController){
        this.statisticController = statisticController;
    }


    public void setPlayers(Player playerA,Player playerB) {
        this.round.setPlayers(playerA, playerB);
    }
}