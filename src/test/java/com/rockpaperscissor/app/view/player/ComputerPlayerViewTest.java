package com.rockpaperscissor.app.view.player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;

import static org.mockito.Mockito.*;
import com.rockpaperscissor.app.utils.Shape;

public class ComputerPlayerViewTest {
    @Mock
    ComputerPlayerView computerPlayerView;

    @Before
    public void setUp(){
        computerPlayerView = mock(ComputerPlayerView.class);
    }

    @Test
    public void shouldGetRandomString(){
        //TO DO SOLVE

        //MockedStatic<ComputerPlayerView> mockedStatic = mockStatic(ComputerPlayerView.class);
        //mockedStatic.when(() -> ComputerPlayerView.getRandomString(5)).thenReturn(anyString());

        //assertEquals(ComputerPlayerView.getRandomString(5), anyString());
    }

    @Test
    public void ShouldGetRandomShape(){
        when(computerPlayerView.getRandomShape()).thenReturn(Shape.PAPER, Shape.ROCK, Shape.SCISSOR);
        assertNotNull(computerPlayerView.getRandomShape());
    }
}
