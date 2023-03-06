package com.rockpaperscissor.app.controller.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerAdminControllerTest {
    
    @Mock
    PlayerAdminController playerAdminController;

    @Before
    public void setUp(){
        playerAdminController = mock(PlayerAdminController.class);
    }

    @Test 
    public void shouldAddPlayers(){
        
    }

    @Test
    public void ShouldSearchPlayer(){
    }

    @Test
    public void ShouldSearchPlayerbyName(){
    }

    @Test
    public void ShouldArePlayersDuplicated(){
    }
}
