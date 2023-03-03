package com.rockpaperscissor.app.view.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissor.app.utils.PlayerType;

public class PlayerViewFactoryTest {


    @Test
    public void testGetComputerPlayerView() {
        PlayerView computerView = PlayerViewFactory.getPlayerView(PlayerType.COMPUTER);
        assertEquals(new ComputerPlayerView().getClass(), computerView.getClass());
    }

    @Test
    public void testGetHumanPlayerView() {
        PlayerView humanView = PlayerViewFactory.getPlayerView(PlayerType.HUMAN);
        assertEquals(new HumanPlayerView().getClass(), humanView.getClass());
    }

}
