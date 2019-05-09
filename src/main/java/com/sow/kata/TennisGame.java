package com.sow.kata;

import com.sow.kata.model.Player;

public class TennisGame {

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
                        score = "Love_All";
                        break;
                    case 1:
                        score = "Fifteen_All";
                        break;
                    case 2:
                        score = "Thirty_All";
                        break;
                }
            }else {
                score = "Deuce";
            }
        }
        return score;
    }
}
