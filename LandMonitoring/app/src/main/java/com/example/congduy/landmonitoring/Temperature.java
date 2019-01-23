package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Temperature extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Node 1", getListNhietDo1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListNhietDo2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListNhietDo3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListNhietDo4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListNhietDo5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListNhietDo6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListNhietDo7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListNhietDo8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListNhietDo9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListNhietDo10()));
        return results;
    }
}