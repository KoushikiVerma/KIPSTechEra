package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UserSignupActivity extends Toolbar_MainActivity {


    EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    Button signupButton;
    TextView loginRedirectText;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        usernameEditText = findViewById(R.id.signup_username);
        emailEditText = findViewById(R.id.signup_email);
        passwordEditText = findViewById(R.id.signup_password);
        confirmPasswordEditText = findViewById(R.id.signup_confirm);
        signupButton = findViewById(R.id.btnSignupUser);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        dbHelper = new DatabaseHelper(this);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to login activity
                // For example:
                Intent intent = new Intent(UserSignupActivity.this, UserLoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void registerUser() {
        String username = usernameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();
        String confirmPassword = confirmPasswordEditText.getText().toString().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        if (!password.equals(confirmPassword)) {
            Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            return;
        }

        long id = dbHelper.registerUser(username, password);

        if (id != -1) {
            Toast.makeText(this, "User registered successfully", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(UserSignupActivity.this, UserLoginActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Failed to register user", Toast.LENGTH_SHORT).show();
        }
    }
}
