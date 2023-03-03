package com.rockpaperscissor.app.model;

import com.rockpaperscissor.app.utils.PlayerType;

public class Player{
    private String name;
    private int score;
    private PlayerType type;

    public Player(String name, PlayerType type) {
        this.name = name.toUpperCase();
        this.score = 0;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    public void setScore() {
        this.score++;
    }

    public PlayerType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return "\tName: " + name 
            + "\tScore: " + score 
            + "\tType: " + type;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Player other = (Player) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}