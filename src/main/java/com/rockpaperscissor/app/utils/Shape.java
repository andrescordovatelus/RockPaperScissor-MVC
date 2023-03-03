package com.rockpaperscissor.app.utils;

public enum Shape {
    ROCK,
    SCISSOR,
    PAPER;

    public static boolean winsWith(Shape shape1, Shape shape2){
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
        else if(shape1 == Shape.PAPER){
            if (shape2 == Shape.ROCK) {
                return true;
            }
            if (shape2 == Shape.SCISSOR) {
                return false;
            }
            if (shape2 == Shape.PAPER) {
                return false;
            }
        }
        else if(shape1 == Shape.ROCK){
            if (shape2 == Shape.ROCK) {
                return false;
            }
            if (shape2 == Shape.SCISSOR) {
                return true;
            }
            if (shape2 == Shape.PAPER) {
                return false;
            }
        }
        return false;
    }


}