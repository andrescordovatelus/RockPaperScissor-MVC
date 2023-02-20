package com.rockpaperscissor.app.Model;

public enum Shape {
    ROCK("ROCK"),
    SCISSOR("SCISSOR"),
    PAPER("PAPER");

    private String name;

    public boolean winsWith(Shape shape1, Shape shape2){
        if(shape1 == Shape.SCISSOR){
            if (shape2 == Shape.ROCK) {
                return false;
            }
            if (shape2 == Shape.PAPER) {
                return true;
            }
            if (shape2 == Shape.SCISSOR) {
                return false;
            }
        }


        return false;
    }

    private Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}