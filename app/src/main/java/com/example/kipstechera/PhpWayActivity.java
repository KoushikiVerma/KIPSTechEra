package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PhpWayActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_way);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        ImageButton btnP1N1=findViewById(R.id.btnP1N1);
        btnP1N1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PhpWayActivity.this, PhpTopicActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnP1N2=findViewById(R.id.btnP1N2);
        btnP1N2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PhpWayActivity.this, PhpVideosActivity.class);
                startActivity(intent);
            }
        });
        ImageButton btnP1N3=findViewById(R.id.btnP1N3);
        btnP1N3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(PhpWayActivity.this, PhpQuizMainActivity.class);
                startActivity(intent);
            }
        });



    }

}


