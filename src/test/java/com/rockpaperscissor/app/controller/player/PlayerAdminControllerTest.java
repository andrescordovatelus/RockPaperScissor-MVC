package com.rockpaperscissor.app.controller.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerAdminControllerTest {
    
    @Mock
    PlayerAdminController playerAdminController;
    Player[] players;

    @Before
    public void setUp(){
        playerAdminController = mock(PlayerAdminController.class);
    }

    @Test 
    public void initGameTest(){
        doNothing().when(playerAdminController).initGame();
    }

    @Test
    public void getGamePlayersTest(){
       /*  players[0] = (new Player("Ivette", PlayerType.COMPUTER));
        players[1] = (new Player("Andres", PlayerType.HUMAN));
        ArgumentCaptor<Player[]> valueCapture = ArgumentCaptor.forClass(Player[].class);
        playerAdminController.getGamePlayers();
        when(playerAdminController.getGamePlayers()).thenReturn(players);
        */
    }
}
