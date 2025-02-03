package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class JavaWayActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_way);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        ImageButton btnJ1N1=findViewById(R.id.btnJ1N1);
        btnJ1N1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(JavaWayActivity.this, JavaTopicActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnJ1N2=findViewById(R.id.btnJ1N2);
        btnJ1N2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(JavaWayActivity.this, JavaVideosActivity.class);
                startActivity(intent);
            }
        });

        ImageButton btnJ1N3=findViewById(R.id.btnJ1N3);
        btnJ1N3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(JavaWayActivity.this, JavaQuizMainActivity.class);
                startActivity(intent);
            }
        });

    }

}

