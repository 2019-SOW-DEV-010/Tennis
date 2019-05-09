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
        if(playerOne.getPointsScored() == 0 && playerTwo.getPointsScored() ==0) {
            return "Love_All";
        }else if(playerOne.getPointsScored() == 1 && playerTwo.getPointsScored() == 1) {
            return "Fifteen_All";
        }else if(playerOne.getPointsScored() == 2 && playerTwo.getPointsScored() == 2) {
            return "Thirty_All";
        }
        return null;
    }
}
