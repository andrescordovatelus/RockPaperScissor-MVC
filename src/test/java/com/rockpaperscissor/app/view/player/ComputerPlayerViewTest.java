package com.rockpaperscissor.app.view.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import com.rockpaperscissor.app.utils.Shape;

public class ComputerPlayerViewTest {
    private ComputerPlayerView computerPlayerView;

    @Before
    public void setUp(){
        computerPlayerView = new ComputerPlayerView();
    }


    @Test
    public void testGetName() {
        MockedStatic<ComputerPlayerView> pc = Mockito.mockStatic(ComputerPlayerView.class);
        pc.when( ()-> ComputerPlayerView.getRandomString(5)).thenReturn("ASDAS");
        assertEquals(5 , ComputerPlayerView.getRandomString(5).length());

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
