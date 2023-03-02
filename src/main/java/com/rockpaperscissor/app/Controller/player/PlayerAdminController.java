package com.rockpaperscissor.app.controller.player;

import java.util.ArrayList;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.view.player.PlayerAdminView;

public class PlayerAdminController {
    private PlayerAdminView playerAdminView;
    private ArrayList<Player> playersList;
    private Player[] gamePlayers;
    private PlayerController[] playersControllers;
    
    public PlayerAdminController() {
        playerAdminView = new PlayerAdminView();
        playersList = new ArrayList<Player>();
        gamePlayers = new Player[2];
        playersControllers = new PlayerController[2];
    }

    public void initGame(){
        int option;
        do{
            option = playerAdminView.showMainMenu();
            switch(option){
                case 1:
                    addPlayer();
                    break;
                case 2:
                    playerAdminView.showPlayers(playersList);
                    break;
                case 3:
                    gamePlayers = setGamPlayers();
                    break;
                default:
                    break;
            }
        }while(option >= 1 && option <= 3);
    }

    private void addPlayer(){
        Player newPlayer, foundPlayer = null;
        do{
            newPlayer = playerAdminView.setPlayerInfo();
            foundPlayer = searchPlayer(newPlayer);
            if(foundPlayer != null){
                playerAdminView.existingPlayerMessage();
            }else{
                playersList.add(newPlayer);
            }
        }while(foundPlayer != null);
    }

    private Player searchPlayer(Player newPlayer){
        return playersList
            .stream()
            .filter(player -> player.equals(newPlayer))
            .findAny()
            .orElse(null);
    }

    private Player searchPlayerByName(String name){
        return playersList
            .stream()
            .filter(player -> player.getName().equals(name))
            .findAny()
            .orElse(null);
    }

    private Player[] setGamPlayers(){
        int i = 0;
        Player foundPlayer = null;
        do{
            String name = playerAdminView.selectGamePlayers(i+1);
            foundPlayer = searchPlayerByName(name.toUpperCase());
            System.out.println(foundPlayer.getName());
            if(foundPlayer != null){
                gamePlayers[i] = foundPlayer;
                i++;
            }
        }while(i < 2 || foundPlayer == null);
        return gamePlayers;
    }

    public Player[] getGamePlayers() {
        return gamePlayers;
    }

    public PlayerController[] setPlayersControllers(){
        playersControllers[0] = PlayerControllerFactory.getPlayerController(gamePlayers[0].getType());
        playersControllers[0].setPlayer(gamePlayers[0]);
        playersControllers[1] = PlayerControllerFactory.getPlayerController(gamePlayers[1].getType());
        playersControllers[1].setPlayer(gamePlayers[1]);
        return playersControllers;
    }
    
}
