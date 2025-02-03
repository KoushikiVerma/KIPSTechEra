package com.example.kipstechera;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewUsersActivity extends Toolbar_MainActivity {

    private ListView listViewUsers;
    private ArrayAdapter<String> adapter;
    private DatabaseHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);
        ImageView overflowMenuImageView = findViewById(R.id.overflow_menu);
        overflowMenuImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        listViewUsers = findViewById(R.id.listViewUsers);
        dbHelper = new DatabaseHelper(this);

        // Fetch all users from the database
        ArrayList<String> userList = dbHelper.getAllUsers();

        // Create an ArrayAdapter with a custom layout for the ListView
        adapter = new ArrayAdapter<String>(this, R.layout.list_item_user, R.id.textViewUser, userList) {
            @Override
            public View getView(final int position, View convertView, android.view.ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView textViewUser = view.findViewById(R.id.textViewUser);
                Button btnRemoveUser = view.findViewById(R.id.btnRemoveUser);

                // Set the username
                String username = getItem(position).trim(); // Trim the username
                textViewUser.setText(username);

                // Set click listener for the remove button
                btnRemoveUser.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String usernameToRemove = getItem(position).trim(); // Trim the username
                        if (dbHelper.deleteUser(usernameToRemove)) {
                            remove(getItem(position));
                            notifyDataSetChanged();
                            Toast.makeText(ViewUsersActivity.this, "User removed successfully", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(ViewUsersActivity.this, "Failed to remove user", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                return view;
            }

        };
        // Set the adapter to the ListView
        listViewUsers.setAdapter(adapter);
    }
}
