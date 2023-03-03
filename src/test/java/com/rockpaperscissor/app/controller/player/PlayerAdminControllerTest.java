package com.rockpaperscissor.app.controller.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerAdminControllerTest {
    private ArrayList<Player> playersList;
    Player[] getGamePlayers = new Player[]{new Player("HOLA", PlayerType.HUMAN), new Player("HOLA", PlayerType.HUMAN)};
    
    @Before
    public void setUp(){
        playersList = new ArrayList<>();
        playersList.add(new Player("hola",  PlayerType.HUMAN));
        playersList.add(new Player("adios", PlayerType.HUMAN));
    }

    @Test 
    public void shouldAddPlayers(){
        addPlayer();
        int newSize = playersList.size();
        assertEquals(3, newSize);
    }

    @Test
    public void ShouldSearchPlayer(){
        Player player = new Player("hola", PlayerType.HUMAN);
        assertEquals(player, searchPlayer(player));
    }

    @Test
    public void ShouldSearchPlayerbyName(){
        playersList.add(new Player("HOLA", PlayerType.HUMAN));
        Player player = new Player("HOLA", PlayerType.HUMAN);

        assertEquals(player, searchPlayerByName("HOLA"));
    }

    @Test
    public void ShouldArePlayersDuplicated(){
        assertTrue(arePlayersDuplicated());
    }

    public boolean arePlayersDuplicated(){
        if(getGamePlayers[0].equals(getGamePlayers[1])){
            return true;
        }
        return false;
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

    private void addPlayer(){
        Player newPlayer, foundPlayer = null;
        do{
            newPlayer = new Player("HOL123A", PlayerType.COMPUTER);
            foundPlayer = searchPlayer(newPlayer);
            if(foundPlayer != null){
                assertTrue("Ya hay un jugador", true);
            }else{
                playersList.add(newPlayer);
            }
        }while(foundPlayer != null);
    }

}
