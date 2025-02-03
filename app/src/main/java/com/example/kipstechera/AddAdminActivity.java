package com.example.kipstechera;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddAdminActivity extends Toolbar_MainActivity {

    EditText adminNameEditText, adminEmailEditText, adminPasswordEditText, adminConfirmPasswordEditText;
    Button signupAdminButton;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_admin);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        adminNameEditText = findViewById(R.id.signup_adminname);
        adminEmailEditText = findViewById(R.id.signup_adminemail);
        adminPasswordEditText = findViewById(R.id.signup_adminpassword);
        adminConfirmPasswordEditText = findViewById(R.id.signup_adminconfirm);
        signupAdminButton = findViewById(R.id.btnSignupUser);
        dbHelper = new DatabaseHelper(this);

        signupAdminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerAdmin();
            }
        });
    }

    private void registerAdmin() {
        String adminName = adminNameEditText.getText().toString().trim();
        String adminEmail = adminEmailEditText.getText().toString().trim();
        String adminPassword = adminPasswordEditText.getText().toString().trim();
        String adminConfirmPassword = adminConfirmPasswordEditText.getText().toString().trim();

        if (adminName.isEmpty() || adminEmail.isEmpty() || adminPassword.isEmpty() || adminConfirmPassword.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!adminPassword.equals(adminConfirmPassword)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return;
        }

        // Proceed to register the new admin
        long result = dbHelper.registerAdmin(adminName, adminPassword);
        if (result != -1) {
            Toast.makeText(this, "Admin registration successful", Toast.LENGTH_SHORT).show();
            // Clear input fields after successful registration
            adminNameEditText.setText("");
            adminEmailEditText.setText("");
            adminPasswordEditText.setText("");
            adminConfirmPasswordEditText.setText("");
        } else {
            Toast.makeText(this, "Admin registration failed", Toast.LENGTH_SHORT).show();
        }
    }
}