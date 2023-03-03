package com.rockpaperscissor.app.model;

import java.util.ArrayList;

public class Statistic {
    private ArrayList<StatisticItem> statistics;

    public Statistic() {
        statistics = new ArrayList<StatisticItem>();
    }

    public ArrayList<StatisticItem> getStatistics() {
        return statistics;
    }

    public void setStatistics(ArrayList<StatisticItem> statistics) {
        this.statistics = statistics;
    }
}
