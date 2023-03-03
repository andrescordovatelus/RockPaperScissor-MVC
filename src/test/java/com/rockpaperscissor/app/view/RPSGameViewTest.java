package com.rockpaperscissor.app.view;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class RPSGameViewTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPlay() {

    }

    @Test
    public void testShowMainWindow() {
        

    }

    @Test
    public void testShowWinner() {

    }
}
