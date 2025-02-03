package com.example.kipstechera;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JavaCertificateActivity extends AppCompatActivity {

    @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_java_certificate);
String loggedInUsername = getIntent().getStringExtra("userName");
TextView tvUserName = findViewById(R.id.tvUserName);
tvUserName.setText(loggedInUsername);
}
}

