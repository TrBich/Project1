package com.example.congduy.landmonitoring;

import com.anychart.chart.common.dataentry.DataEntry;

import java.util.List;

public class ChartItem {
    private String nameX;
    private String nameY;
    private List<DataEntry> dataEntries;

    public ChartItem(String nameX, String nameY, List<DataEntry> dataEntries) {
        this.nameX = nameX;
        this.nameY = nameY;
        this.dataEntries = dataEntries;
    }

    public String getNameX() {
        return nameX;
    }

    public void setNameX(String nameX) {
        this.nameX = nameX;
    }

    public String getNameY() {
        return nameY;
    }

    public void setNameY(String nameY) {
        this.nameY = nameY;
    }

    public List<DataEntry> getDataEntries() {
        return dataEntries;
    }

    public void setDataEntries(List<DataEntry> dataEntries) {
        this.dataEntries = dataEntries;
    }
}
