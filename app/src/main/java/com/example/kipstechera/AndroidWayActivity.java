package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AndroidWayActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_way);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        ImageButton btnA1N1=findViewById(R.id.btnA1N1);
        btnA1N1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(AndroidWayActivity.this, AndroidTopicActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnA1N2=findViewById(R.id.btnA1N2);
        btnA1N2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(AndroidWayActivity.this, AndroidVideosActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btnA1N3=findViewById(R.id.btnA1N3);
        btnA1N3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(AndroidWayActivity.this, AndroidQuizMainActivity.class);
                startActivity(intent);
            }
        });
           }

    }


