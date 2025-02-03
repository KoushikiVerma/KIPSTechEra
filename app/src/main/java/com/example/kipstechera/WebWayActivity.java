package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class WebWayActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_way);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        ImageButton btnW1N1=findViewById(R.id.btnW1N1);
        btnW1N1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(WebWayActivity.this, WebTopicActivity.class);
                startActivity(intent);
            }
        });


        ImageButton btnW1N2=findViewById(R.id.btnW1N2);
        btnW1N2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(WebWayActivity.this, WebVideosActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btnW1N3=findViewById(R.id.btnW1N3);
        btnW1N3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(WebWayActivity.this, WebQuizMainActivity.class);
                startActivity(intent);
            }
        });


    }

}


