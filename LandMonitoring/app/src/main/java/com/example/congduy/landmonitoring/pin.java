package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class pin extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Node 1", getListPin1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListPin2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListPin3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListPin4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListPin5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListPin6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListPin7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListPin8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListPin9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListPin10()));
        return results;
    }
}
