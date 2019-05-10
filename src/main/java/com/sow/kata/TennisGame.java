package com.sow.kata;

import com.sow.kata.model.Player;

public class TennisGame {

    public static final String DEUCE = "Deuce";
    public static final String ALL = "All";
    public static final String UNDERSCORE = "_";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FOURTY = "Fourty";
    public static final int MIN_NUM_POINTS_TO_BE_SCORED = 3;
    public static final int MIN_POINTS_DIFF_NEEDED_TO_WIN = 2;
    public static final String PLAYER1_HAS_WON = "Player1 Has Won";
    public static final String PLAYER2_HAS_WON = "Player2 Has Won";

    private Player playerOne;
    private Player playerTwo;

    public TennisGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        String score = null;
        if(playerOne.getPointsScored() == playerTwo.getPointsScored()) {
            if(playerOne.getPointsScored() < MIN_NUM_POINTS_TO_BE_SCORED) {
                score = getScoreDescription(playerOne.getPointsScored()) +UNDERSCORE+ ALL;
            }else {
                score = DEUCE;
            }
        }else {
            if(playerOne.getPointsScored() > MIN_NUM_POINTS_TO_BE_SCORED  || playerTwo.getPointsScored() > MIN_NUM_POINTS_TO_BE_SCORED) {
                if (playerOne.getPointsScored() - playerTwo.getPointsScored() >= MIN_POINTS_DIFF_NEEDED_TO_WIN) {
                    score = PLAYER1_HAS_WON;
                } else if (playerTwo.getPointsScored() - playerOne.getPointsScored() >= MIN_POINTS_DIFF_NEEDED_TO_WIN) {
                    score = PLAYER2_HAS_WON;
                }
            }else {
                score = getScoreDescription(playerOne.getPointsScored())+UNDERSCORE+getScoreDescription(playerTwo.getPointsScored());
            }
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
                scoreDescription = FOURTY;
                break;
        }
        return scoreDescription;
    }
}
