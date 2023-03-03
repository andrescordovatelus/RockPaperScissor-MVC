package com.rockpaperscissor.app.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.rockpaperscissor.app.utils.PlayerType;

public class RoundTest {
    private Player playerA;
    private Player playerB;
    private Round round;

    @Before
    public void setUp(){
        round = new Round();
        playerA = new Player("Oscar", PlayerType.HUMAN);
        playerB = new Player("Ivette", PlayerType.COMPUTER);
        round.setPlayers(playerA, playerB);
    }

    @Test
    public void testSetPlayers() {
        Player playerC = new Player("Andres", PlayerType.COMPUTER);
        round.setPlayers(playerC, playerC);
        assertNotNull(round.getPlayerA());
    }


    @Test
    public void testGetPlayerA() {
        assertEquals(playerA, round.getPlayerA());

    }

    @Test
    public void testGetPlayerB() {
        assertEquals(playerB, round.getPlayerB());
    }

    @Test
    public void testGetTotalRounds() {
        assertEquals(3, round.getTotalRounds());
    }

}
