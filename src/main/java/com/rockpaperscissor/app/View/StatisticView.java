package com.rockpaperscissor.app.view;

import java.util.ArrayList;

import com.rockpaperscissor.app.model.StatisticItem;

public class StatisticView {

    public void showStatistics(ArrayList<StatisticItem> statistics){
        System.out.println("======================================STATISTICS======================================");
        for(StatisticItem statisticItem : statistics) {
            System.out.println(statisticItem.toString());
        }
    }
}
