package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class PH extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Node 1", getListPH1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListPH2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListPH3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListPH4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListPH5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListPH6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListPH7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListPH8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListPH9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListPH10()));
        return results;
    }
}
