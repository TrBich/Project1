package com.example.congduy.landmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewParameter extends AppCompatActivity {

    Button Temperature;
    Button Humidity;
    Button PH;
    Button Brightness;
    Button Soil_hum;
    Button Pin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_parameter);

        Temperature = (Button) findViewById(R.id.temperature);
        Temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tems = new Intent(viewParameter.this, Temperature.class);
                startActivity(tems);
            }
        });

        Humidity = (Button) findViewById(R.id.humidity);
        Humidity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hums = new Intent(viewParameter.this, Humidity.class);
                startActivity(hums);
            }
        });

        PH = (Button) findViewById(R.id.ph);
        PH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phs = new Intent(viewParameter.this, PH.class);
                startActivity(phs);
            }
        });

        Brightness = (Button) findViewById(R.id.brightness);
        Brightness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bris = new Intent(viewParameter.this, Brightness.class);
                startActivity(bris);
            }
        });

        Soil_hum = (Button) findViewById(R.id.soil_hum);
        Soil_hum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sois = new Intent(viewParameter.this, soil_hum.class);
                startActivity(sois);
            }
        });

        Pin = (Button) findViewById(R.id.pin);
        Pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pins = new Intent(viewParameter.this, pin.class);
                startActivity(pins);
            }
        });
    }
}
