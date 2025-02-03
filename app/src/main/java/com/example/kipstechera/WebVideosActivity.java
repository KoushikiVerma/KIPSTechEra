package com.example.kipstechera;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WebVideosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_videos);
        ImageButton youtubeButtonW1 = findViewById(R.id.btnWV1);

        // Set a click listener on the ImageButton
        youtubeButtonW1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&si=J2bQI0PRAJ-Jhq2s"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonW2 = findViewById(R.id.btnWV2);

        // Set a click listener on the ImageButton
        youtubeButtonW2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9agiCUZYRsvtGTXdxkzPyItg&si=cL3eVXJaOgzR-87q"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonW3 = findViewById(R.id.btnWV3);

        // Set a click listener on the ImageButton
        youtubeButtonW3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLfqMhTWNBTe0PY9xunOzsP5kmYIz2Hu7i&si=yTM5fbeEblUfXQaP"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonW4 = findViewById(R.id.btnWV4);

        // Set a click listener on the ImageButton
        youtubeButtonW4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLr6-GrHUlVf_ZNmuQSXdS197Oyr1L9sPB&si=l741XYB_U_RO6W0C"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonW5 = findViewById(R.id.btnWV5);

        // Set a click listener on the ImageButton
        youtubeButtonW5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/ESnrn1kAD4E?si=_z57ROXgfgt87_nd"));
                startActivity(intent);
            }
        });
        ImageButton youtubeButtonW6 = findViewById(R.id.btnWV6);

        // Set a click listener on the ImageButton
        youtubeButtonW6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLr6-GrHUlVf8JIgLcu3sHigvQjTw_aC9C&si=EVuufYn2Svy-C97u"));
                startActivity(intent);
            }
        });ImageButton youtubeButtonW7 = findViewById(R.id.btnWV7);

        // Set a click listener on the ImageButton
        youtubeButtonW7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLGjplNEQ1it_oTvuLRNqXfz_v_0pq6unW&si=Iq5_dJZFlW-op16h"));
                startActivity(intent);
            }
        });ImageButton youtubeButtonW8 = findViewById(R.id.btnWV8);

        // Set a click listener on the ImageButton
        youtubeButtonW8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtube.com/playlist?list=PLu0W_9lII9ahR1blWXxgSlL4y9iQBnLpR&si=Rt9hGg_htSRCpiDO"));
                startActivity(intent);
            }
        });
    }

}
