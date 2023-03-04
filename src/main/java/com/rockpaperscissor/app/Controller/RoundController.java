package com.rockpaperscissor.app.controller;

import com.rockpaperscissor.app.controller.player.PlayerController;
import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Round;
import com.rockpaperscissor.app.model.StatisticItem;
import com.rockpaperscissor.app.utils.Shape;
import com.rockpaperscissor.app.view.RoundView;

public class RoundController {
    private RoundView roundView;
    private Round round;
    private static int roundCounter = 1;
    private PlayerController[] playersController;
    private StatisticController statisticController;

    public RoundController() {
        roundView = new RoundView();
        playersController = new PlayerController[2];
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public void setPlayersController(PlayerController[] playersController) {
        this.playersController = playersController;
    }

    public void determinateWinner(Shape shapePlayerA, Shape shapePlayerB) {
        if (Shape.winsWith(shapePlayerA, shapePlayerB)) {
            playersController[0].increaseScore();

        } else {
            playersController[1].increaseScore();
        }

        if (playersController[0].getScore() > playersController[1].getScore()) {
            roundView.showWinner(playersController[0].getPlayer(), playersController[1].getPlayer());
        } else {
            roundView.showWinner(playersController[1].getPlayer(), playersController[0].getPlayer());
            

        }
    }

    public void initGame() {
        Shape shapePlayerA;
        Shape shapePlayerB;
        PlayerController playerController;

        do {
            playerController = playersController[0];
            shapePlayerA = executeRound(playerController);

            playerController = playersController[1];
            shapePlayerB = executeRound(playerController);

            if (shapePlayerA.equals(shapePlayerB)) {
                roundView.showTie();
            } else {
                determinateWinner(shapePlayerA,shapePlayerB);
                statisticController.addStatistic(new StatisticItem(
                        roundCounter,
                        playersController[0].getName(),
                        shapePlayerA,
                        playersController[1].getName(),
                        shapePlayerB));
                roundCounter++;
            }
        } while (roundCounter <= round.getTotalRounds() && verifyRoundExistence() == true);
    }

    private boolean verifyRoundExistence() {
        if(playersController[0].getScore() == 2 || playersController[1].getScore() == 2){
            return false;
        }else{
            return true;
        }
    }

    private Shape executeRound(PlayerController playerController) {
        roundView.executeRound(roundCounter, playerController.getName());
        return playerController.selectShape();
    }

    public void setStatisticController(StatisticController statisticController) {
        this.statisticController = statisticController;
    }

    public void setPlayers(Player playerA, Player playerB) {
        this.round.setPlayers(playerA, playerB);
    }
}