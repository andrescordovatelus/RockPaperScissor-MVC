package com.rockpaperscissor.app.view;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import com.rockpaperscissor.app.model.Player;
import com.rockpaperscissor.app.utils.PlayerType;

public class RoundViewTest {    
    @Mock
    RoundView roundView;

    @Mock
    Player player;

    @Before
    public void setUp() {
        roundView = mock( RoundView.class);
        player = mock(Player.class);
    }
    
    @Test
    public void testShowTie() {
        doNothing().when(roundView).showTie();
    }

    @Test
    public void ShouldShowWinner(){
        Player winner = new Player("ganador", PlayerType.HUMAN);
        Player looser = new Player("perdedor", PlayerType.COMPUTER);

        ArgumentCaptor<Player> valueCapture = ArgumentCaptor.forClass(Player.class);
        roundView.showWinner(winner, looser);
        doNothing().when(roundView).showWinner(valueCapture.capture(), valueCapture.capture());
    }

    @Test
    public void ShouldexecuteRound() {
        int round = 1;
        String name = "santiago";

        ArgumentCaptor<Integer> valueCaptureInt = ArgumentCaptor.forClass(Integer.class);
        ArgumentCaptor<String> valueCaptureString = ArgumentCaptor.forClass(String.class);
        roundView.executeRound(round, name);
        doNothing().when(roundView).executeRound(valueCaptureInt.capture(), valueCaptureString.capture());
    }
}