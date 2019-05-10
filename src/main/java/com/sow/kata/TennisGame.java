package com.sow.kata;

import com.sow.kata.model.Player;

import java.util.Arrays;
import java.util.List;

public class TennisGame {

    private static final String DEUCE = "Deuce";
    private static final String ALL = "All";
    private static final String UNDERSCORE = "_";
    private static final int MIN_NUM_POINTS_TO_BE_SCORED = 3;
    private static final int MIN_POINTS_DIFF_NEEDED_TO_WIN = 2;
    private static final String PLAYER1_HAS_WON = "Player1 Has Won";
    private static final String PLAYER2_HAS_WON = "Player2 Has Won";
    private static final String PLAYER1_HAS_ADVANTAGE = "Player1 Has Advantage";
    private static final String PLAYER2_HAS_ADVANTAGE = "Player2 Has Advantage";
    private static final List<String> scoreDescriptions = Arrays.asList("Love", "Fifteen", "Thirty", "Forty");

    private Player playerOne;
    private Player playerTwo;

    public TennisGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        String score = null;
        if(isPlayersScoresAreEqual()) {
            score = deuceOrAllScore();
        }else if(isPlayersScoredMinimumPoints()) {
            score = wonTheGameOrHasAdvantage();
        }else {
            score = scoreDescriptions.get(playerOne.getPointsScored())+UNDERSCORE+scoreDescriptions.get(playerTwo.getPointsScored());
        }
        return score;
    }

    private boolean isPlayersScoredMinimumPoints() {
        return playerOne.getPointsScored() > MIN_NUM_POINTS_TO_BE_SCORED  || playerTwo.getPointsScored() > MIN_NUM_POINTS_TO_BE_SCORED;
    }

    private boolean isPlayersScoresAreEqual() {
        return playerOne.getPointsScored() == playerTwo.getPointsScored();
    }

    private String hasAdvantage() {
        String score = null;
        if(playerOne.getPointsScored()- playerTwo.getPointsScored() == 1) {
            score = PLAYER1_HAS_ADVANTAGE;
        }
        if(playerTwo.getPointsScored() - playerOne.getPointsScored() == 1) {
            score = PLAYER2_HAS_ADVANTAGE;
        }
        return score;
    }

    private String deuceOrAllScore() {
        return playerOne.getPointsScored() < MIN_NUM_POINTS_TO_BE_SCORED ? scoreDescriptions.get(playerOne.getPointsScored())+UNDERSCORE+ ALL : DEUCE;
    }

    private String wonTheGameOrHasAdvantage() {
        if(Math.abs(playerOne.getPointsScored() - playerTwo.getPointsScored()) >= MIN_POINTS_DIFF_NEEDED_TO_WIN) {
            return playerOne.getPointsScored()>playerTwo.getPointsScored() ? PLAYER1_HAS_WON : PLAYER2_HAS_WON;
        }
        return hasAdvantage();
    }

}
