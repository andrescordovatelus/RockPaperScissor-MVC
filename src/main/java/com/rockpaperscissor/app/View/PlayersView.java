package com.rockpaperscissor.app.View;

import java.util.Scanner;

public  class PlayersView {

    public static int createPlayer(){
        System.out.println("SELECT PLAYER TYPE");
        System.out.println("1.HUMAN \n 2.COMPUTER");
        int option = 0;
        Scanner in = new Scanner(System.in);
        option = in.nextInt();
        in.close();
        return option;
    }

    public static int selectShape(){
        System.out.println("> Select shape...");
        System.out.println("Choose your option \n 1.Rock" +
        "\n 2.Paper \n 3.Scissors");
        int option = 0;
        Scanner in = new Scanner(System.in);
        option = in.nextInt();
        in.close();
        return option;
    }

}
