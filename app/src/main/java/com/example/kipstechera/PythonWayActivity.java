package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PythonWayActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_way);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        ImageButton btnPy1N1=findViewById(R.id.btnPy1N1);
        btnPy1N1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PythonWayActivity.this, PythonTopicActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnPy1N2=findViewById(R.id.btnPy1N2);
        btnPy1N2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PythonWayActivity.this, PythonVideosActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnPy1N3=findViewById(R.id.btnPy1N3);
        btnPy1N3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PythonWayActivity.this, PythonQuizMainActivity.class);
                startActivity(intent);
            }
        });

    }

}


