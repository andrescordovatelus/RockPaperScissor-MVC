package com.rockpaperscissor.app.controller.player;

import java.util.ArrayList;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.view.player.PlayerAdminView;

public class PlayerAdminController {
    private PlayerAdminView playerAdminView;
    private ArrayList<Player> playersList;
    private PlayerController[] playersControllers;
    public Player[] getGamePlayers;
    
    public PlayerAdminController() {
        playerAdminView = new PlayerAdminView();
        playersList = new ArrayList<Player>();
        playersControllers = new PlayerController[2];
        getGamePlayers = new Player[2];
    }

    public void initGame(){
        boolean cont = true;
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
                    if(playersList.size() < 2){
                        playerAdminView.playersListErrorMessage();
                    }
                    else{
                        playerAdminView.showPlayers(playersList);
                        setGamPlayers();
                        cont = false;
                    }
                    break;
                default:
                    break;
            }
        }while(option >= 1 && option <= 3 && cont);
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

    private Player searchPlayerById(int id){
        if((id < 0) || (id > playersList.size())){
            playerAdminView.playerNotFoundErrorMessage();
            return null;
        }
        return playersList.get(id-1);
    }

    private void setGamPlayers(){
        int i = 0;
        Player foundPlayer = null;
        boolean duplicates = false;
        do{
            int id = playerAdminView.selectGamePlayers(i+1);
            foundPlayer = searchPlayerById(id);

            if(foundPlayer != null){
                this.getGamePlayers[i] = foundPlayer;
                i++;
            }
            
            if(i == 2){
                duplicates = arePlayersDuplicated();
                if(duplicates == true){
                    playerAdminView.duplicatesErrorMessage();
                    i--;
                }

            }
        }while(i < 2 || foundPlayer == null || duplicates == true);
    }

    private boolean arePlayersDuplicated(){
        if(getGamePlayers[0].equals(getGamePlayers[1])){
            return true;
        }
        return false;
    }

    public Player[] getGamePlayers() {
        return getGamePlayers;
    }

    public PlayerController[] setPlayersControllers(){
        playersControllers[0] = PlayerControllerFactory.getPlayerController(getGamePlayers[0].getType());
        playersControllers[0].setPlayer(getGamePlayers[0]);
        playersControllers[1] = PlayerControllerFactory.getPlayerController(getGamePlayers[1].getType());
        playersControllers[1].setPlayer(getGamePlayers[1]);
        return playersControllers;
    }
    
}
