package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class node9 extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Nhiet do", getListNhietDo9()));
        results.add(new ChartItem("Thoi gian", "Do am", getListDoam9()));
        results.add(new ChartItem("Thoi gian", "PH", getListPH9()));
        results.add(new ChartItem("Thoi gian", "Anh Sang", getListAnhSang9()));
        results.add(new ChartItem("Thoi gian", "DA_Dat", getListDA_Dat9()));
        results.add(new ChartItem("Thoi gian", "Pin", getListPin9()));
        return results;
    }
}