package com.sow.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisGameTest {

    @Test
    public void shouldReturnLoveAllWhenBothPlayersHasZeroPoints() {
        TennisGame game = new TennisGame(0,0);

        String score = game.getScore();

        assertEquals("Love_All", score);
    }

    @Test
    public void shouldReturnFifteenALlWhenBothPlayersScoresOnePointEach() {
        TennisGame game = new TennisGame(1,1);

        String score = game.getScore();

        assertEquals("Fifteen_All", score);
    }
}
