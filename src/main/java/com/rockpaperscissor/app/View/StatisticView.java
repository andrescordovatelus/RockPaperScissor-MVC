package com.rockpaperscissor.app.View;

import java.util.ArrayList;

import com.rockpaperscissor.app.Model.StatisticItem;

public class StatisticView {



    public void showStatistics(ArrayList<StatisticItem> statistics){
        System.out.println("======================================STATISTICS======================================");
        statistics.forEach( e -> System.out.println(e.toString()));
    }
}
