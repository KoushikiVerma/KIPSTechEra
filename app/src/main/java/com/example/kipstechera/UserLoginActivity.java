package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UserLoginActivity extends Toolbar_MainActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;
    TextView signupRedirectText;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        usernameEditText = findViewById(R.id.login_username);
        passwordEditText = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.btnLoginUser);
        signupRedirectText = findViewById(R.id.signupRedirectText);
        dbHelper = new DatabaseHelper(this);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUserAndLogin();
            }
        });

        signupRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to user registration activity
                Intent intent = new Intent(UserLoginActivity.this, UserSignupActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void checkUserAndLogin() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Check if user is registered
        User user = dbHelper.getUserByUsername(username);
        if (user == null) {
            // User is not registered
            Toast.makeText(this, "User is not registered", Toast.LENGTH_SHORT).show();
            // Navigate to user registration activity
            Intent intent = new Intent(UserLoginActivity.this, UserSignupActivity.class);
            startActivity(intent);
        } else {
            // User is registered, proceed with login
            loginUser(username, password);
        }
    }

    private void loginUser(String username, String password) {
        if (dbHelper.loginUser(username, password)) {
            // Login successful
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(UserLoginActivity.this, CourseActivity.class);
            startActivity(intent);
            finish();
        } else {
            // Invalid password
            Toast.makeText(this, "Invalid password", Toast.LENGTH_SHORT).show();
        }
    }
}
