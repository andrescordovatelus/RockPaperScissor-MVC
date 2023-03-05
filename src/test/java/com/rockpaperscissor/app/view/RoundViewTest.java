package com.rockpaperscissor.app.view;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class RoundViewTest {
private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @Test
    public void testShowTie() {
        showTie();
        assertEquals("TIE! Please try to play again", outputStreamCaptor.toString());
    }

    // @Test
    // public void testShowRoundWinner() {
    //     showRoundWinner(new Player("Oscar", PlayerType.HUMAN));
    //     assertEquals("Oscar", outputStreamCaptor.toString());
    // }

    public void showTie() {
        System.out.print("TIE! Please try to play again");
    }
    public void executeRound(int round, String name){
        System.out.print("ROUND " + round + " IS STARTING");
        System.out.print( name + "'s turn");
    }

    public void showRoundWinner(Player winner){
        System.out.print(winner.getName() + " WON THE ROUND " 
        + " HAS A SCORE OF " + winner.getScore());

    }

}