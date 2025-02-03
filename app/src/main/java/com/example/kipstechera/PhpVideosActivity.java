package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PhpVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_videos);
        ImageButton youtubeButtonP1 = findViewById(R.id.btnPV1);

        // Set a click listener on the ImageButton
        youtubeButtonP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9aikXkRE0WxDt1vozo3hnmtR&si=tGT6vSkWw7qnqaZC"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonP2 = findViewById(R.id.btnPV2);

        // Set a click listener on the ImageButton
        youtubeButtonP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/EJWw1bd0-C0?si=IJa4RKHNcH131Ks2"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonP3 = findViewById(R.id.btnPV3);

        // Set a click listener on the ImageButton
        youtubeButtonP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PL0b6OzIxLPbyrzCMJOFzLnf_-_5E_dkzs&si=dLa0Kv1EaWlQ6jFT"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonP4 = findViewById(R.id.btnPV4);

        // Set a click listener on the ImageButton
        youtubeButtonP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PL4cUxeGkcC9gksOX3Kd9KPo-O68ncT05o&si=WZqVUCY3_iyfN1io"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonP5 = findViewById(R.id.btnPV5);

        // Set a click listener on the ImageButton
        youtubeButtonP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PL0eyrZgxdwhwwQQZA79OzYwl5ewA7HQih&si=fPqRn35c2jzvLu12"));
                startActivity(intent);
            }
        });

    }

}
