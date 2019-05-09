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
                switch (playerOne.getPointsScored()) {
                    case 0:
                        score = LOVE;
                        break;
                    case 1:
                        score = FIFTEEN;
                        break;
                    case 2:
                        score = THIRTY;
                        break;
                }
                score = score +UNDERSCORE+ ALL;
            }else {
                score = DEUCE;
            }
        }else {
            if(playerOne.getPointsScored() == 1 && playerTwo.getPointsScored() == 0) {
                score = FIFTEEN+UNDERSCORE+LOVE;
            }else if(playerOne.getPointsScored() == 2 && playerTwo.getPointsScored() ==0 ) {
                score = THIRTY+UNDERSCORE+LOVE;
            }
        }
        return score;
    }
}
