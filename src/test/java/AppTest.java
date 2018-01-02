import models.PlayGame;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/2/18.
 */
public class AppTest {
    @Test
    public void respondsToWrongInput() {
        PlayGame testPlayGame = new PlayGame();
        String playerOne = "not valid";
        assertEquals("This is not a valid choice.", PlayGame.validResponse(playerOne));
    }
    @Test
    public void rockPaperPlayers() {
        PlayGame testPlayGame = new PlayGame();
        String playerOne = "Rock";
        assertEquals("PlayerTwo Wins", PlayGame.validResponse(playerOne));
    }

}
