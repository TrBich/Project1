package com.example.congduy.landmonitoring;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class soil_hum extends LineChartActivity {
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
        results.add(new ChartItem("Thoi gian", "Node 1", getListDA_Dat1()));
        results.add(new ChartItem("Thoi gian", "Node 2", getListDA_Dat2()));
        results.add(new ChartItem("Thoi gian", "Node 3", getListDA_Dat3()));
        results.add(new ChartItem("Thoi gian", "Node 4", getListDA_Dat4()));
        results.add(new ChartItem("Thoi gian", "Node 5", getListDA_Dat5()));
        results.add(new ChartItem("Thoi gian", "Node 6", getListDA_Dat6()));
        results.add(new ChartItem("Thoi gian", "Node 7", getListDA_Dat7()));
        results.add(new ChartItem("Thoi gian", "Node 8", getListDA_Dat8()));
        results.add(new ChartItem("Thoi gian", "Node 9", getListDA_Dat9()));
        results.add(new ChartItem("Thoi gian", "Node 10", getListDA_Dat10()));
        return results;
    }
}
