package com.rockpaperscissor.app.controller;

import com.rockpaperscissor.app.model.StatisticItem;

public class StatisticFacade {
    private StatisticController statisticController;

    public StatisticFacade(StatisticController statisticController) {
        this.statisticController = statisticController;
    }

    public void add(StatisticItem item){
        statisticController.addStatistic(item);
    }
}
