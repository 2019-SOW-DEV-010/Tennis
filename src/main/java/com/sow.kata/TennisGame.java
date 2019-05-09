package com.sow.kata;

public class TennisGame {

    private int player1Score;
    private int player2Score;

    public TennisGame(int player1ScorePoints, int player2ScorePoints) {
        this.player1Score = player1ScorePoints;
        this.player2Score = player2ScorePoints;
    }

    public String getScore() {
        if(player1Score == 0 && player2Score ==0) {
            return "Love_All";
        }
        return null;
    }
}
