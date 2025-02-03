package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PhpTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnP1 = findViewById(R.id.btn_php1);
        Button btnP2 = findViewById(R.id.btn_php2);
        Button btnP3=findViewById(R.id.btn_php3);
        Button btnP4=findViewById(R.id.btn_php4);
        Button btnP5=findViewById(R.id.btn_php5);
        btnP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhpTopicActivity.this, PhpOverviewActivity.class);
                startActivity(intent);

            }
        });
        btnP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhpTopicActivity.this, PhpInstallationActivity.class);
                startActivity(intent);

            }
        });
        btnP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhpTopicActivity.this, PhpBasicsActivity.class);
                startActivity(intent);

            }
        });
        btnP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhpTopicActivity.this, PhpDatabaseActivity.class);
                startActivity(intent);

            }
        });
        btnP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhpTopicActivity.this, PhpOopsActivity.class);
                startActivity(intent);

            }
        });


    }
}