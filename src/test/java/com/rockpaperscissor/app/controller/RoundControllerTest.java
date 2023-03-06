package com.rockpaperscissor.app.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import com.rockpaperscissor.app.controller.player.PlayerController;
import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.model.Round;
import com.rockpaperscissor.app.utils.Shape;

public class RoundControllerTest {
    @Mock
    RoundController roundController;

    @Before
    public void setUp(){
        roundController = mock(RoundController.class);
    }


    @Test
    public void testDeterminateWinner() {
        ArgumentCaptor<Shape> valueCapture = ArgumentCaptor.forClass(Shape.class);
        ArgumentCaptor<Shape> valueCapture2 = ArgumentCaptor.forClass(Shape.class);
        doNothing().when(roundController).determinateWinner(valueCapture.capture(),valueCapture2.capture());
    }

    @Test
    public void testInitGame() {
        doNothing().when(roundController).initGame();
    }

    @Test
    public void testSetPlayers() {
        ArgumentCaptor<Player> playerA = ArgumentCaptor.forClass(Player.class);
        ArgumentCaptor<Player> playerB = ArgumentCaptor.forClass(Player.class);
        doNothing().when(roundController).setPlayers(playerA.capture(), playerB.capture());
    }

    @Test
    public void testSetPlayersController() {
        ArgumentCaptor<PlayerController[]> controller = ArgumentCaptor.forClass(PlayerController[].class);
        doNothing().when(roundController).setPlayersController(controller.capture());
    }

    @Test
    public void testSetRound() {
        ArgumentCaptor<Round> round = ArgumentCaptor.forClass(Round.class);
        doNothing().when(roundController).setRound(round.capture());
    }

    @Test
    public void testSetStatisticFacade() {
        ArgumentCaptor<StatisticFacade> statisticFacade = ArgumentCaptor.forClass(StatisticFacade.class);
        doNothing().when(roundController).setStatisticFacade(statisticFacade.capture());

    }
}
