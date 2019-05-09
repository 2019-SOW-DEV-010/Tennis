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

        assertEquals("Love_All", game.getScore());
    }

    @Test
    public void shouldReturnFifteenALlWhenBothPlayersScoresOnePointEach() {
        playerOne.winABall();
        playerTwo.winABall();

        assertEquals("Fifteen_All", game.getScore());
    }

    @Test
    public void shouldReturnThirtyALlWhenBothPlayersScoresTwoPointEach() {
        playerOne.winABall();
        playerOne.winABall();
        playerTwo.winABall();
        playerTwo.winABall();

        assertEquals("Thirty_All", game.getScore());
    }

    @Test
    public void shouldReturnDeuceWhenBothPlayersScoresThreePointsEach() {
        playerOne.winABall();
        playerOne.winABall();
        playerOne.winABall();
        playerTwo.winABall();
        playerTwo.winABall();
        playerTwo.winABall();

        assertEquals("Deuce", game.getScore());
    }
}

