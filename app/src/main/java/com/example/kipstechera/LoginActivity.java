package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends Toolbar_MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); Button btnAdminLogin=findViewById(R.id.btn_admin_login);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        Button btnUserLogin=findViewById(R.id.btn_user_login);
        btnAdminLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, AdminLoginActivity.class);
                startActivity(intent);
            }
        });

        btnUserLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, UserLoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
