package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PythonTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnPy1 = findViewById(R.id.btn_python1);
        Button btnPy2 = findViewById(R.id.btn_python2);
        Button btnPy3=findViewById(R.id.btn_python3);
        Button btnPy4=findViewById(R.id.btn_python4);
        Button btnPy5=findViewById(R.id.btn_python5);
        btnPy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonTopicActivity.this, PythonOverviewActivity.class);
                startActivity(intent);

            }
        });
        btnPy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonTopicActivity.this,  PythonBasicsActivity.class);
                startActivity(intent);

            }
        });
        btnPy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonTopicActivity.this, PythonExceptionsActivity.class);
                startActivity(intent);

            }
        });
        btnPy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonTopicActivity.this, PythonOopsActivity.class);
                startActivity(intent);

            }
        });
        btnPy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PythonTopicActivity.this, PythonDSActivity.class);
                startActivity(intent);

            }
        });


    }
}