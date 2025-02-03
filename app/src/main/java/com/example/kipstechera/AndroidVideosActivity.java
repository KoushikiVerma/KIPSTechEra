package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class AndroidVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_videos);
        ImageButton youtubeButton1 = findViewById(R.id.btnAV1);
        youtubeButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLjVLYmrlmjGdDps6HAwOOVoAtBPAgIOXL&si=jm6Ev0VjBDwrndn4"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButton2 = findViewById(R.id.btnAV2);
        youtubeButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9aiL0kysYlfSOUgY5rNlOhUd&si=xRjeQ7_M66KJs_eI"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButton3 = findViewById(R.id.btnAV3);
        youtubeButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLsyeobzWxl7p-lZvWabkVJdM_UVURhUh4&si=F3gF2ou-BOWumrA_"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButton4 = findViewById(R.id.btnAV4);
        youtubeButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLUhfM8afLE_Ok-0Lx2v9hfrmbxi3GgsX1&si=kVP9kBmUFCA7WDfr"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButton5 = findViewById(R.id.btnAV5);
        youtubeButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLUcsbZa0qzu3Mri2tL1FzZy-5SX75UJfb&si=mr4kc2g0pDZUV6Z0"));
                startActivity(intent);
            }
        });

    }

}