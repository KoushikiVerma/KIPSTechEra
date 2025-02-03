package com.example.kipstechera;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminLoginActivity extends Toolbar_MainActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;
    DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        usernameEditText = findViewById(R.id.login_username);
        passwordEditText = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.btnLoginAdmin);
        dbHelper = new DatabaseHelper(this);

        // Initialize the main admin user (Koushiki)
        initializeMainAdminUser();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginAdmin();
            }
        });
    }

    private void initializeMainAdminUser() {
        // Check if main admin user (Koushiki) exists, if not, create it
        if (!dbHelper.loginAdmin("Koushiki", "1904")) {
            dbHelper.registerAdmin("Koushiki", "1904");
        }
    }

    private void loginAdmin() {
        String username = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Check admin credentials
        if (dbHelper.loginAdmin(username, password)) {
            // Admin login successful
            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
            // Proceed to admin home activity
            Intent intent = new Intent(AdminLoginActivity.this, AdminHomeActivity.class);
            startActivity(intent);
            finish(); // Finish the current activity to prevent going back to it with back button
        } else {
            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
        }
    }
}
