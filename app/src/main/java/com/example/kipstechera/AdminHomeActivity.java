package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AdminHomeActivity extends Toolbar_MainActivity {

    Button addAdminButton, viewAdminButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        addAdminButton = findViewById(R.id.btnAddAdmin);
        viewAdminButton = findViewById(R.id.btnViewAdmin);

        addAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addAdminIntent = new Intent(AdminHomeActivity.this, AddAdminActivity.class);
                startActivity(addAdminIntent);
            }
        });

        viewAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewAdminIntent = new Intent(AdminHomeActivity.this, ViewUsersActivity.class);
                startActivity(viewAdminIntent);
            }
        });
    }
}
