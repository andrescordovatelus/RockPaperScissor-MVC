package com.rockpaperscissor.app.Model;


public class Player{
    private String name;
    private int score;
    private Boolean isHuman;

    public Player(String name, Boolean isHuman) {
        this.name = name;
        this.score = 0;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }
    public void setScore() {
        this.score++;
    }

    public Boolean getIsHuman() {
        return isHuman;
    }
    
}