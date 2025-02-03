package com.example.kipstechera;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Toolbar_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    protected void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.getMenuInflater().inflate(R.menu.overflow_menu, popupMenu.getMenu());
        // Handle menu item clicks
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.action_home) {

                    Intent intent = new Intent(Toolbar_MainActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();

                    return true;
                } else if (id == R.id.action_about_us) {
                    // Handle Contact Us click
                    Intent intent = new Intent(Toolbar_MainActivity.this, AboutUsActivity.class);
                    startActivity(intent);
                    finish();
                    return true;
                }
                else if (id == R.id.action_contact_us) {
                    Intent intent = new Intent(Toolbar_MainActivity.this, ContactUsActivity.class);
                    startActivity(intent);
                    finish();
                    return true;
                }else if (id == R.id.action_rate_us) {
                    openPlayStoreForRating();
                    return true;
                }
                else if (id == R.id.action_share) {
                    shareApp();
                    return true;
                }
                else if (id == R.id.action_logout) {
                    Intent intent = new Intent(Toolbar_MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                    return true;
                }

                return false;
            }
        });

        popupMenu.show();
    }


    private void openPlayStoreForRating() {
        try {
            // Redirect users to the Google Play Store for rating
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + getPackageName())));
        } catch (ActivityNotFoundException e) {
            // If the Play Store app is not available, open the Play Store website
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    private void shareApp() {
        // Create an intent to share the app's link or content
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareMessage = "Check out this cool app: https://play.google.com/store/apps/details?id=" + getPackageName();
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}
