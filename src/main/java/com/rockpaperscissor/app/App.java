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

        Shape a = Shape.SCISSOR;

       System.out.println(a.winsWith(a, Shape.PAPER)); 


    }
}
