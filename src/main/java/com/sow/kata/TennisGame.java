package com.sow.kata;

import com.sow.kata.model.Player;

public class TennisGame {

    public static final String DEUCE = "Deuce";
    public static final String ALL = "All";
    public static final String UNDERSCORE = "_";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";

    private Player playerOne;
    private Player playerTwo;

    public TennisGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        String score = null;
        if(playerOne.getPointsScored() == playerTwo.getPointsScored()) {
            if(playerOne.getPointsScored() <3) {
                score = getScoreDescription(playerOne.getPointsScored()) +UNDERSCORE+ ALL;
            }else {
                score = DEUCE;
            }
        }else {
           score = getScoreDescription(playerOne.getPointsScored())+UNDERSCORE+getScoreDescription(playerTwo.getPointsScored());
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
        }
        return scoreDescription;
    }
}
