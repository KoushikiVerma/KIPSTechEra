package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class CWayActivity extends Toolbar_MainActivity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_c_way);
                ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
                overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                showPopupMenu(v);
                        }
                });
        ImageButton btnC1N1=findViewById(R.id.btnC1N1);
        btnC1N1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view){
        Intent intent = new Intent(CWayActivity.this, CTopicActivity.class);
        startActivity(intent);
        }
        });

                ImageButton btnC1N2=findViewById(R.id.btnC1N2);
                btnC1N2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view){
                                Intent intent = new Intent(CWayActivity.this, CCPPVideosActivity.class);
                                startActivity(intent);
                        }
                });

                ImageButton btnC1N3=findViewById(R.id.btnC1N3);
                btnC1N3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view){
                                Intent intent = new Intent(CWayActivity.this, CCPPQuizMainActivity.class);
                                startActivity(intent);
                        }
                });


        }

        }
