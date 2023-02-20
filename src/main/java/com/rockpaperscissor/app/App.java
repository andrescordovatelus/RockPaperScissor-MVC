package com.rockpaperscissor.app;

import com.rockpaperscissor.app.Model.Shape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Shape shape = Shape.PAPER;
        Shape shape2 = Shape.ROCK;
        System.out.println(shape.winsWith(shape, shape2));
    }
}
