package com.example.kipstechera;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PythonCertificateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_certificate);

        // Retrieve the username passed from the previous activity
        String loggedInUsername = getIntent().getStringExtra("userName");

        // Find the TextView to display the username
        TextView tvUserName = findViewById(R.id.tvUserName);

        // Set the username to the TextView
        tvUserName.setText(loggedInUsername);
    }
}
