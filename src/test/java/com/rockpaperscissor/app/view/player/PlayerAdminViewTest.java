package com.rockpaperscissor.app.view.player;
import static org.mockito.Mockito.doNothing;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerAdminViewTest {

    @Mock
    PlayerAdminView playerAdminView;

    ArrayList<Player> players;

    @Before
    public void setUp(){
       playerAdminView = Mockito.mock(PlayerAdminView.class);
       players = new ArrayList<>();
    }

    @Test
    public void testExistingPlayerMessage() {
        doNothing().when(playerAdminView).existingPlayerMessage();
    }

    @Test
    public void testPlayersListErrorMessage() {
        doNothing().when(playerAdminView).playersListErrorMessage();
    }

    @Test
    public void testDuplicatesErrorMessage(){
        doNothing().when(playerAdminView).duplicatesErrorMessage();
    }

    @Test
    public void testPlayerNotFoundErrorMessage(){
        doNothing().when(playerAdminView).playerNotFoundErrorMessage();
    }

    @Test
    public void testShowPlayers(){
        players.add(new Player("hola", PlayerType.COMPUTER));
        ArgumentCaptor<ArrayList<Player>> valueCapture = ArgumentCaptor.forClass(ArrayList.class);
        playerAdminView.showPlayers(players);
        doNothing().when(playerAdminView).showPlayers(valueCapture.capture());
    }
}
