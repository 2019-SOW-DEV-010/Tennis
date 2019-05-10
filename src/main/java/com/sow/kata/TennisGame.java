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
    private static final String PLAYER1 = "Player1 ";
    private static final String PLAYER2 = "Player2 ";
    private static final String HAS_WON = "Has Won";
    private static final String HAS_ADVANTAGE = "Has Advantage";
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
            score = getPlayerWithMaximumScore()+wonTheGameOrHasAdvantage();
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

    private String deuceOrAllScore() {
        return playerOne.getPointsScored() < MIN_NUM_POINTS_TO_BE_SCORED ? scoreDescriptions.get(playerOne.getPointsScored())+UNDERSCORE+ ALL : DEUCE;
    }

    private String wonTheGameOrHasAdvantage() {
       return Math.abs(playerOne.getPointsScored() - playerTwo.getPointsScored()) >= MIN_POINTS_DIFF_NEEDED_TO_WIN ? HAS_WON : HAS_ADVANTAGE;
    }

    private String getPlayerWithMaximumScore() {
        return playerOne.getPointsScored()>playerTwo.getPointsScored() ? PLAYER1 : PLAYER2;
    }

}
