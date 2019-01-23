package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Brightness extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Node 1", getListAnhSang1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListAnhSang2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListAnhSang3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListAnhSang4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListAnhSang5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListAnhSang6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListAnhSang7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListAnhSang8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListAnhSang9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListAnhSang10()));
        return results;
    }
}