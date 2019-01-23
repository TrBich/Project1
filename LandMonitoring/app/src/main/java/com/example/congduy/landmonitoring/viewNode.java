package com.example.congduy.landmonitoring;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class viewNode extends AppCompatActivity {

    Button node1;
    Button node2;
    Button node3;
    Button node4;
    Button node5;
    Button node6;
    Button node7;
    Button node8;
    Button node9;
    Button node10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_node);
        node1 = (Button) findViewById(R.id.node1);
        node1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node1s = new Intent(viewNode.this, node1.class);
                startActivity(node1s);
            }
        });

        node2 = (Button) findViewById(R.id.node2);
        node2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node2s = new Intent(viewNode.this, node2.class);
                startActivity(node2s);
            }
        });

        node3 = (Button) findViewById(R.id.node3);
        node3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node3s = new Intent(viewNode.this, node3.class);
                startActivity(node3s);
            }
        });

        node4 = (Button) findViewById(R.id.node4);
        node4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node4s = new Intent(viewNode.this, node4.class);
                startActivity(node4s);
            }
        });

        node5 = (Button) findViewById(R.id.node5);
        node5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node5s = new Intent(viewNode.this, node5.class);
                startActivity(node5s);
            }
        });

        node6 = (Button) findViewById(R.id.node6);
        node6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node6s = new Intent(viewNode.this, node6.class);
                startActivity(node6s);
            }
        });

        node7 = (Button) findViewById(R.id.node7);
        node7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node7s = new Intent(viewNode.this, node7.class);
                startActivity(node7s);
            }
        });

        node8 = (Button) findViewById(R.id.node8);
        node8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node8s = new Intent(viewNode.this, node8.class);
                startActivity(node8s);
            }
        });

        node9 = (Button) findViewById(R.id.node9);
        node9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node9s = new Intent(viewNode.this, node9.class);
                startActivity(node9s);
            }
        });

        node10 = (Button) findViewById(R.id.node10);
        node10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent node10s = new Intent(viewNode.this, node10.class);
                startActivity(node10s);
            }
        });
    }
}
