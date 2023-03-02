package com.rockpaperscissor.app.view.player;

import java.util.ArrayList;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.Console;
import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerAdminView {

    public int showMainMenu(){
        System.out.println("1. Add player");
        System.out.println("2. Show players");
        System.out.println("3. Select players");
        System.out.print("\tYour option: ");
        return Console.getInt();
    }
    
    private PlayerType selectPlayerType(){
        System.out.println("SELECT PLAYER TYPE");
        for(PlayerType type : PlayerType.values()){
            System.out.println((type.ordinal() + 1) + ". " + type.toString());
        }
        System.out.print("\tYour option: ");
        int type = Console.getInt();
        return PlayerType.values()[type - 1];
    }

    public Player setPlayerInfo(){
        PlayerType type = selectPlayerType();
        PlayerView playerView = PlayerViewFactory.getPlayerView(type);
        String name = playerView.getName();
        
        return new Player(name, type);
    }

    public void existingPlayerMessage() {
        System.out.println("That player already exist. Please try again.");
    }

    public void showPlayers(ArrayList<Player> playersList) {
        System.out.println("==================PLAYERS LIST==================");
        playersList.forEach(player -> System.out.println(player.toString()));
    }

    public String selectGamePlayers(int numberOfPlayer){
        System.out.println("Select player #" + numberOfPlayer);
        return Console.getStringNext();
    }

    public void duplicatesErrorMessage(){
        System.out.println("Both players must be different, please try again");
    }

    public void playersListErrorMessage(){
        System.out.println("The list must have at least two players.");
    }

}
