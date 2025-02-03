package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AndroidTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnA1 = findViewById(R.id.btn_andy1);
        Button btnA2 = findViewById(R.id.btn_andy2);
        Button btnA3=findViewById(R.id.btn_andy3);
        Button btnA4=findViewById(R.id.btn_andy4);
        Button btnA5=findViewById(R.id.btn_andy5);
        btnA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidTopicActivity.this, AndroidOverviewActivity.class);
                startActivity(intent);

            }
        });
        btnA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidTopicActivity.this, AndroidInstallActivity.class);
                startActivity(intent);

            }
        });
        btnA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidTopicActivity.this, AndroidViewsActivity.class);
                startActivity(intent);

            }
        });
        btnA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidTopicActivity.this, AndroidThreadActivity.class);
                startActivity(intent);

            }
        });
        btnA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AndroidTopicActivity.this, AndroidSqliteActivity.class);
                startActivity(intent);

            }
        });


    }
}