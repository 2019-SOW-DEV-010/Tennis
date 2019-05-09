package com.sow.kata.model;

public class Player {

    private int pointsScored;

    public int getPointsScored() {
        return pointsScored;
    }

    public void winABall() {
        pointsScored = pointsScored+1;
    }

}
