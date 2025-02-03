package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CourseActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
       ImageButton  btnC=findViewById(R.id.imageButtonC);
        ImageButton  btnJava=findViewById(R.id.imageButtonJava);
        ImageButton  btnWeb=findViewById(R.id.imageButtonWeb);
        ImageButton  btnAndroid=findViewById(R.id.imageButtonAndroid);
        ImageButton  btnPhp=findViewById(R.id.imageButtonPhp);
        ImageButton  btnPython=findViewById(R.id.imageButtonPython);
        btnC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, CWayActivity.class);
                startActivity(intent);
            }
        });
        btnJava.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, JavaWayActivity.class);
                startActivity(intent);
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, WebWayActivity.class);
                startActivity(intent);
            }
        });
        btnAndroid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, AndroidWayActivity.class);
                startActivity(intent);
            }
        });
        btnPhp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, PhpWayActivity.class);
                startActivity(intent);
            }
        });
        btnPython.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(CourseActivity.this, PythonWayActivity.class);
                startActivity(intent);
            }
        });


    }
}