package com.rockpaperscissor.app.view.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.rockpaperscissor.app.utils.Shape;

public class ComputerPlayerViewTest {
    private ComputerPlayerView computerPlayerView;

    @Before
    public void setUp(){
        computerPlayerView = new ComputerPlayerView();
    }


    @Test
    public void testGetName() {
        String name = computerPlayerView.getName();
        assertEquals(5, name.length());
    }

    @Test
    public void testGetRandomString() {
        assertEquals(10, ComputerPlayerView.getRandomString(10).length());
    }

    @Test
    public void testSelectShape() {
        Shape computerShapee = computerPlayerView.selectShape();
        assertNotNull(computerShapee);
    }
    
}
