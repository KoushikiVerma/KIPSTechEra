package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class WebTopicActivity extends Toolbar_MainActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_topic);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnW1 = findViewById(R.id.btn_web1);
        Button btnW2 = findViewById(R.id.btn_web2);
        Button btnW3=findViewById(R.id.btn_web3);
        Button btnW4=findViewById(R.id.btn_web4);
        Button btnW5=findViewById(R.id.btn_web5);
        btnW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebTopicActivity.this, WebOverviewActivity.class);
                startActivity(intent);

            }
        });
        btnW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebTopicActivity.this, WebHtmlActivity.class);
                startActivity(intent);

            }
        });
        btnW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebTopicActivity.this, WebCssActivity.class);
                startActivity(intent);

            }
        });
        btnW4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebTopicActivity.this, WebJSActivity.class);
                startActivity(intent);

            }
        });
        btnW5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WebTopicActivity.this, WebDiffHtmlCssJSActivity.class);
                startActivity(intent);

            }
        });


    }
}