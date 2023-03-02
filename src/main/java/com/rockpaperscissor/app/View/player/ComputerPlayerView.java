package com.rockpaperscissor.app.view.player;

import com.rockpaperscissor.app.utils.Shape;

public class ComputerPlayerView extends PlayerView {

    @Override
    public String getName() {
        System.out.println("Generating name...");
        String name = ComputerPlayerView.getRandomString(5);
        System.out.println("Name: " + name);
        return name;
    }

    static String getRandomString(int n) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = (int) (alphabet.length()
                    * Math.random());

            sb.append(alphabet
                    .charAt(index));
        }

        return sb.toString();
    }

    @Override
    public Shape selectShape() {
        return null;
    }

    
}
