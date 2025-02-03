package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class JavaTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnJ1 = findViewById(R.id.btn_j1);
        Button btnJ2 = findViewById(R.id.btn_j2);
        Button btnJ3=findViewById(R.id.btn_j3);
        Button btnJ4=findViewById(R.id.btn_j4);
        Button btnJ5=findViewById(R.id.btn_j5);
        btnJ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaTopicActivity.this, JavaOverviewActivity.class);
                startActivity(intent);

            }
        });
        btnJ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaTopicActivity.this, JavaBasicsActivity.class);
                startActivity(intent);

            }
        });
        btnJ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaTopicActivity.this, JavaOOPsActivity.class);
                startActivity(intent);

            }
        });
        btnJ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaTopicActivity.this, JavaThreadActivity.class);
                startActivity(intent);

            }
        });
        btnJ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JavaTopicActivity.this, JavaAppletsActivity.class);
                startActivity(intent);

            }
        });


    }
}