package com.example.kipstechera;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class WebJSActivity extends AppCompatActivity {
    private TextView noteTextView1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_js);
        noteTextView1 = findViewById(R.id.JSBasics);
        Toast.makeText(getApplicationContext(),"Notes Will be uploaded soon",Toast.LENGTH_SHORT).show();

        displayNotes();
    }

    private void displayNotes() {
        String htmlNotes1 = "<html><body>" +
                "<h1 align='center' color='blue'><u></u></h1>" +
                "<h2></h2>"+

                "</body></html>";


        noteTextView1.setText(Html.fromHtml(htmlNotes1));


    }
}

