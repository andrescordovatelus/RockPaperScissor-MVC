package com.rockpaperscissor.app.model;

public class StatisticItem {
    private int round;
    private String playerA;
    private Shape playerAShape;
    private String playerB;
    private Shape playerBShape;


    public StatisticItem(int round, String playerA, Shape playerAShape, String playerB, Shape playerBShape) {
        this.round = round;
        this.playerA = playerA;
        this.playerAShape = playerAShape;
        this.playerB = playerB;
        this.playerBShape = playerBShape;
    }


    @Override
    public String toString() {
        return "StatisticItem [round=" + round + ", playerA=" + playerA + ", playerAShape=" + playerAShape
                + ", playerB=" + playerB + ", playerBShape=" + playerBShape + "]";
    }

    

}
