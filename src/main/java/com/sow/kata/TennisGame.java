package com.sow.kata;

import com.sow.kata.model.Player;

public class TennisGame {

    private static final String DEUCE = "Deuce";
    private static final String ALL = "All";
    private static final String UNDERSCORE = "_";
    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final int MIN_NUM_POINTS_TO_BE_SCORED = 3;
    private static final int MIN_POINTS_DIFF_NEEDED_TO_WIN = 2;
    private static final String PLAYER1_HAS_WON = "Player1 Has Won";
    private static final String PLAYER2_HAS_WON = "Player2 Has Won";
    private static final String PLAYER1_HAS_ADVANTAGE = "Player1 Has Advantage";
    private static final String PLAYER2_HAS_ADVANTAGE = "Player2 Has Advantage";

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
            score = getScoreDescription(playerOne.getPointsScored())+UNDERSCORE+getScoreDescription(playerTwo.getPointsScored());
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
        return playerOne.getPointsScored() < MIN_NUM_POINTS_TO_BE_SCORED ? getScoreDescription(playerOne.getPointsScored())+UNDERSCORE+ ALL : DEUCE;
    }

    private String wonTheGameOrHasAdvantage() {
        String score = null;
        if (playerOne.getPointsScored() - playerTwo.getPointsScored() >= MIN_POINTS_DIFF_NEEDED_TO_WIN) {
            score = PLAYER1_HAS_WON;
        } else if (playerTwo.getPointsScored() - playerOne.getPointsScored() >= MIN_POINTS_DIFF_NEEDED_TO_WIN) {
            score = PLAYER2_HAS_WON;
        }else {
            score = hasAdvantage();
        }
        return score;
    }

    private String getScoreDescription(int score) {
        String scoreDescription = "";
        switch (score) {
            case 0:
                scoreDescription = LOVE;
                break;
            case 1:
                scoreDescription = FIFTEEN;
                break;
            case 2:
                scoreDescription = THIRTY;
                break;
            case 3:
                scoreDescription = FORTY;
                break;
        }
        return scoreDescription;
    }
}
