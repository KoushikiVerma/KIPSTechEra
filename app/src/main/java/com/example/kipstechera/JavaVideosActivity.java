package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class JavaVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_videos);
        ImageButton youtubeButtonJ1 = findViewById(R.id.btnJV1);

        // Set a click listener on the ImageButton
        youtubeButtonJ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&si=nWCMqe_G3gyFQf_O"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonJ2 = findViewById(R.id.btnJV2);

        // Set a click listener on the ImageButton
        youtubeButtonJ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agS67Uits0UnJyrYiXhDS6q&si=jwA2uo002cA03SAZ"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonJ3 = findViewById(R.id.btnJV3);

        // Set a click listener on the ImageButton
        youtubeButtonJ3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/eIrMbAQSU34?si=tG5yvF1sHyVWOwte"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonJ4 = findViewById(R.id.btnJV4);

        // Set a click listener on the ImageButton
        youtubeButtonJ4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLsyeobzWxl7pe_IiTfNyr55kwJPWbgxB5&si=IE6E4Wf0UZ_okjG2"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonJ5 = findViewById(R.id.btnJV5);

        // Set a click listener on the ImageButton
        youtubeButtonJ5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&si=8Z2rANuYxCybgrJk"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonJ6 = findViewById(R.id.btnJV6);

        // Set a click listener on the ImageButton
        youtubeButtonJ6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLS1QulWo1RIbfTjQvTdj8Y6yyq4R7g-Al&si=8Z2rANuYxCybgrJk"));
                startActivity(intent);
            }
        });

    }

}
