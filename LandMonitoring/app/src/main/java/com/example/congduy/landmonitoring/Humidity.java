package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Humidity extends LineChartActivity {
    ChartAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.line_chart_activity);
        RecyclerView rcvList = findViewById(R.id.rcvList);
        rcvList.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ChartAdapter(dummy());
        rcvList.setAdapter(adapter);
    }

    private List<ChartItem> dummy() {
        List<ChartItem> results = new ArrayList<>();
        results.add(new ChartItem("Thoi gian", "Node 1", getListDoam1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListDoam2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListDoam3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListDoam4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListDoam5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListDoam6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListDoam7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListDoam8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListDoam9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListDoam10()));
        return results;
    }
}