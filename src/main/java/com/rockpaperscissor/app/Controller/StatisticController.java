package com.rockpaperscissor.app.Controller;

import java.util.ArrayList;

import com.rockpaperscissor.app.Model.StatisticItem;
import com.rockpaperscissor.app.View.StatisticView;

public class StatisticController {
    private ArrayList<StatisticItem> statistics;
    private StatisticView statisticView;

    public StatisticController(){
        statistics = new ArrayList<StatisticItem>();
        statisticView = new StatisticView();
    }

    public void addStatistic(StatisticItem item){
        statistics.add(item);
    }

    public void showStatistics(){
        statisticView.showStatistics(statistics);
    }

}
