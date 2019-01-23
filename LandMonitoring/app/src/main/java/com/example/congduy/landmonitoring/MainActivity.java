package com.example.congduy.landmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button viewNode;
    Button viewParameter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewNode = (Button) findViewById(R.id.viewNode);
        viewNode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nodeSwitch = new Intent(MainActivity.this, viewNode.class);
                startActivity(nodeSwitch);
        }
    });

        viewParameter = (Button) findViewById(R.id.viewParameter);
        viewParameter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paraSwitch = new Intent(MainActivity.this, viewParameter.class);
                startActivity(paraSwitch);
            }
        });
    }
}
