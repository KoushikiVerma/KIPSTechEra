package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CCPPVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ccpp_videos);
        ImageButton youtubeButtonC1 = findViewById(R.id.btnCV1);

        // Set a click listener on the ImageButton
        youtubeButtonC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/irqbmMNs2Bo?si=CAK089R1rbr6tmb7"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonC2 = findViewById(R.id.btnCV2);
        youtubeButtonC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLxgZQoSe9cg1drBnejUaDD9GEJBGQ5hMt&si=pZOKhzwOxxVw1KPm"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonC3 = findViewById(R.id.btnCV3);
        youtubeButtonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9aiXlHcLx-mDH1Qul38wD3aR&si=nJCaLZs2s_h-ByLk"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonC4 = findViewById(R.id.btnCV4);
        youtubeButtonC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLxgZQoSe9cg0df_GxVjz3DD_Gck5tMXAd&si=7pIb9VsVLRLd544c"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonC5 = findViewById(R.id.btnCV5);
        youtubeButtonC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ&si=Q06-x_ii7J_SiiFQ"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonC6 = findViewById(R.id.btnCV6);
        youtubeButtonC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agpFUAlPFe_VNSlXW5uE0YL&si=zYcv7sHD-JelwQ_m"));
                startActivity(intent);
            }
        });

    }

}
