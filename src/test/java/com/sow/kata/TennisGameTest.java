package com.sow.kata;

import com.sow.kata.model.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {

    TennisGame game;
    Player playerOne;
    Player playerTwo;


    @Before
    public void initializeGame() {
        playerOne = new Player();
        playerTwo = new Player();
        game = new TennisGame(playerOne,playerOne);
    }

    @Test
    public void shouldReturnLoveAllWhenBothPlayersHasZeroPoints() {
        String score = game.getScore();

        assertEquals("Love_All", score);
    }

    @Test
    public void shouldReturnFifteenALlWhenBothPlayersScoresOnePointEach() {
        playerOne.setPointsScored(1);
        playerTwo.setPointsScored(1);

        String score = game.getScore();

        assertEquals("Fifteen_All", score);
    }
}
