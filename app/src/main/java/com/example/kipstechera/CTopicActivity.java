package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnC1 =findViewById(R.id.btn_c1);
        btnC1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent intent = new Intent(CTopicActivity.this, COverviewActivity.class);
        startActivity(intent);

        }
        });
        Button btnC2 =findViewById(R.id.btn_c2);
        btnC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CTopicActivity.this, CBasicsActivity.class);
                startActivity(intent);

            }
        });
        Button btnC3 =findViewById(R.id.btn_c3);
        btnC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CTopicActivity.this, CProgramsActivity.class);
                startActivity(intent);

            }
        });
        Button btnC4 =findViewById(R.id.btn_c4);
        btnC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CTopicActivity.this, CvsCPPActivity.class);
                startActivity(intent);

            }
        });
        Button btnC5 =findViewById(R.id.btn_c5);
        btnC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CTopicActivity.this, COOPsActivity.class);
                startActivity(intent);

            }
        });
    }
        }