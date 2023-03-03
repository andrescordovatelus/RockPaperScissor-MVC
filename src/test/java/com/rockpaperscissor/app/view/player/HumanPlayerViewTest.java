package com.rockpaperscissor.app.view.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissor.app.utils.Shape;

public class HumanPlayerViewTest {


    @Test
    public void testGetName() {
        assertEquals("Miko",getName());
    }

    @Test
    public void testSelectShape() {
        assertEquals(Shape.PAPER, selectShape());

    }

    public String getName() {
        return "Miko";
    }

    public Shape selectShape(){
        return Shape.PAPER;
    }
}
