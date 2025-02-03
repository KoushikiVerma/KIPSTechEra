package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PythonVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_videos);
        ImageButton youtubeButtonPy1 = findViewById(R.id.btnPyV1);

        // Set a click listener on the ImageButton
        youtubeButtonPy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/ERCMXc8x7mc?si=4NtvsoSU0Vamg4Rg"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonPy2 = findViewById(R.id.btnPyV2);

        // Set a click listener on the ImageButton
        youtubeButtonPy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/vLqTf2b6GZw?si=6nr6Asyo7u1_KmnX"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonPy3 = findViewById(R.id.btnPyV3);

        // Set a click listener on the ImageButton
        youtubeButtonPy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agwh1XjRt242xIpHhPT2llg&si=S8Agh5xQG44L4yY8"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonPy4 = findViewById(R.id.btnPyV4);

        // Set a click listener on the ImageButton
        youtubeButtonPy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLjVLYmrlmjGcQfNj_SLlLV4Ytf39f8BF7&si=gf5POeXrheP2TiWk"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonPy5 = findViewById(R.id.btnPyV5);

        // Set a click listener on the ImageButton
        youtubeButtonPy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLsyeobzWxl7poL9JTVyndKe62ieoN-MZ3&si=Xd1S7x04btn0Cmls"));
                startActivity(intent);
            }
        });

    }

}